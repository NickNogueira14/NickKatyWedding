WeddingApp.controller('EmailConfirmationCtrl', function($scope, $mdDialog, $http){
	
	$scope.guest = {
			guestKey: null,
			guestName: '',
			guestEmail: '',
			guestTelephone: '',
			quantityAddGuests: 0,
			guestNotes: ''
	};
	$scope.showForm = false;
	
	$scope.showAlert = function(ev) {
		$mdDialog.show(
			$mdDialog.alert()
				.clickOutsideToClose(false)
				.title('Registro das Informações')
				.textContent('Por favor, preencha o formulário com as informações necessárias.')
				.ariaLabel('Registro das Informações')
				.ok('Preencher')
		).finally(function(){
			$scope.showForm = true;
		});
	};
	
	$scope.confirmGuests = function() {
		$mdDialog.show(
			$mdDialog.alert()
			.title('Confirmação das Informações')
			.textContent('Guest Key: ' + $scope.guest.guestKey +
						'Nome: ' + $scope.guest.name + 
						'\nTelefone: ' + $scope.guest.telephone + 
						'\nE-Mail: ' + $scope.guest.email + 
						'\nConvidados Adicionais: ' + $scope.guest.addGuests + 
						'\nObservações: ' + $scope.guest.notes)
			.ariaLabel('Confirmação das Informações')
			.ok('Confirmar')
		);
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
				"guestKey" : 123123,
				"guestName" : $scope.guest.guestName,
				"guestEmail" : $scope.guest.guestEmail,
				"guestTelephone" : $scope.guest.guestTelephone,
				"quantityAddGuests" : $scope.guest.quantityAddGuests,
				"guestNotes" : $scope.guest.guestNotes
		}
		$http({
			method: 'POST',
			url: 'confirmation/add',
			data: angular.toJson(guestConf),
			headers: { 'Content-Type' : 'application/json'}
		}).success(function(data, status){
			$scope.guest = angular.copy(data);
			$scope.confirmGuest();
			console.log("SUCESSO!!!")
		}).error(function(data, status){
			console.log("FALHOU!!!")
		});
	}
	
});