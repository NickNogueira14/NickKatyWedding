WeddingApp.controller('EmailConfirmationCtrl', ['$scope', '$mdDialog', '$http', function($scope, $mdDialog, $http){
	
	$scope.guest = {
			guestKey: null,
			guestName: '',
			guestEmail: '',
			guestTelephone: '',
			quantityAddGuests: 0,
			guestNotes: ''
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
	
	resetFields = function(){
		$scope.guest.name = '';
		$scope.guest.email = '';
		$scope.guest.telephone = '';
		$scope.guest.addGuests = 0;
		$scope.guest.notes = '';
		$scope.showForm = false;
	};
	
	$scope.guestConfirmation = function(){
		
		var guestConf = {
				guestName : $scope.guest.guestName,
				guestEmail : $scope.guest.guestEmail,
				guestTelephone : $scope.guest.guestTelephone,
				quantityAddGuests : $scope.guest.quantityAddGuests,
				guestNotes : $scope.guest.guestNotes
		};
		$http({
			method: 'POST',
			url: 'confirmation/add',
			data: angular.toJson(guestConf)
		}).success(function(data){
			$scope.guest = data;
			console.log("SUCESSO!!!");
		}).error(function(data){
			console.log(data);
		});
	};
	
}]);