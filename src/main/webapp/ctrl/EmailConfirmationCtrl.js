WeddingApp.controller('EmailConfirmationCtrl', function($scope, $mdDialog){
	
	$scope.guest = {
		name: '',
		email: '',
		telephone: '',
		addGuestsAdults: 0,
		addGuestsKids: 0,
		addGuestsNames: [],
		notes: ''
	};
	
	$scope.showAlert = function(ev) {
		$mdDialog.show(
			$mdDialog.alert()
				.clickOutsideToClose(false)
				.title('Registro das Informações')
				.textContent('Por favor ' + $scope.guest.email + ', reencha o formulário com as informações necessárias.')
				.ariaLabel('Registro das Informações')
				.ok('Preencher')
		);
	};
	
});