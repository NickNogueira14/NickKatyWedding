WeddingApp.controller('EmailConfirmationCtrl', ['$scope', '$mdDialog', '$http', function($scope, $mdDialog, $http){
	
	$scope.addGuest = {
			addGuestId: null,
			addGuestName: null,
			addGuestAge: null,
			addGuestNameLabel: null,
			addGuestAgeLabel: null
	};
	
	$scope.guest = {
			guestKey: null,
			guestName: null,
			guestEmail: null,
			guestTelephone: null,
			quantityAddGuests: null,
			addGuestList: [],
			guestNotes: null
	};
	
	$scope.showForm = false;
	$scope.goHome = false;
	
	$scope.showAlert = function(ev) {
		$mdDialog.show(
			$mdDialog.confirm()
				.clickOutsideToClose(false)
				.title('Validação de e-mail')
				.textContent('E-mail validado com sucesso! Deseja confirmar sua presença agora?')
				.ariaLabel('Verificação de e-mail')
				.ok('Sim')
				.cancel('Não')
		).then(function(){
			$scope.showForm = true;
			$scope.goHome = false;
		}, function(){
			$scope.goHome = true;
			$scope.showForm = false;
		});
	};
	
	$scope.showSuccess = function(ev) {
		$mdDialog.show(
				$mdDialog.alert()
					.clickOutsideToClose(true)
					.title('Presença Confirmada com Sucesso!')
					.ariaLabel('Presença Confirmada com Sucesso')
					.ok('OK')
					.targetEvent(ev)
		);
	}
	
	$scope.cancelConfirmation = function(ev) {
		$mdDialog.show(
			$mdDialog.confirm()
			.title('Confirmação de Cancelamento')
			.textContent('Tem certeza que deseja cancelar sua confirmação?')
			.ok('Sim')
			.cancel('Não')
		).then(function(){
				resetFields();
			}, function(){
				
			});
	};
	
	var resetFields = function(){
		$scope.guest = {
				guestKey: null,
				guestName: null,
				guestEmail: null,
				guestTelephone: null,
				quantityAddGuests: null,
				addGuestList: [],
				guestNotes: null
		};
	};
	
	$scope.guestConfirmation = function(){
		
		var guestConf = {
				guestName : $scope.guest.guestName,
				guestEmail : $scope.guest.guestEmail,
				guestTelephone : $scope.guest.guestTelephone,
				quantityAddGuests : $scope.guest.quantityAddGuests,
				additionalGuestsList: $scope.guest.addGuestList,
				guestNotes : $scope.guest.guestNotes
		};
		$http({
			method: 'POST',
			url: 'confirmation/add',
			data: angular.toJson(guestConf)
		}).success(function(data){
			$scope.showSuccess();
			resetFields();
		}).error(function(data){
			console.log(data);
		});
	};
	
	$scope.insertAdditionalGuestsFields = function() {
		
		var addGuestListAux = $scope.guest.addGuestList;
		
		$scope.guest.addGuestList = [];
		
		if($scope.guest.quantityAddGuests != null && $scope.guest.quantityAddGuests > 0){
			for(var i=0; i < $scope.guest.quantityAddGuests; i++) {
				if(angular.isDefined(addGuestListAux[i])) {
					var addGuest = {
							addGuestId: 'addGuest' + i,
							addGuestName: addGuestListAux[i].addGuestName,
							addGuestAge: addGuestListAux[i].addGuestAge,
							addGuestNameLabel: 'Nome do Acompanhante ' + (i + 1),
							addGuestAgeLabel: 'Idade do Acompanhante ' + (i + 1)
					};
				} else {
					var addGuest = {
							addGuestId: 'addGuest' + i,
							addGuestName: null,
							addGuestAge: null,
							addGuestNameLabel: 'Nome do Acompanhante ' + (i + 1),
							addGuestAgeLabel: 'Idade do Acompanhante ' + (i + 1)
					};
				}
				
				$scope.guest.addGuestList.push(addGuest);
			}
		}
	};
	
	
}]);