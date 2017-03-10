WeddingApp.controller('MessageCoupleCtrl',
				['$scope','$http', '$interval', '$mdDialog', function($scope, $http, $interval, $mdDialog) {
	
	$scope.message = {
			messageContent : null,
			messageAuthor : null,
			messageCreate : null
	};
	
	$scope.messageLoading = false;
	
	$scope.messageList = [];
	
	$scope.sendMessage = function() {
		
		$scope.messageLoading = true;
		
		if(angular.isDefined($scope.message.messageContent) && $scope.message.messageContent != null) {
			if(angular.isDefined($scope.message.messageAuthor) && $scope.message.messageAuthor != null) {
				var msg = {
						messageContent : $scope.message.messageContent,
						messageAuthor : $scope.message.messageAuthor
				}
				
				$http({
					method : 'POST',
					url : 'messageToCouple/add',
					data : angular.toJson(msg)
				}).success(function(data) {
					$scope.messageList.push(data);
					
					$scope.message = {
							messageContent : null,
							messageAuthor : null,
							messageCreate : null
					};
					
					$scope.showAlert('Muito Obrigado pela sua mensagem!')
					
					$scope.messageLoading = false;
				}).error(function(data) {
					$scope.messageLoading = false;
					console.log('ERRO: ' + data);
				});
			} else {
				$scope.messageLoading = false;
				$scope.showAlert('Por gentileza, nos informe seu nome no campo Assinatura.');
			}
		} else {
			$scope.messageLoading = false;
			$scope.showAlert('Sua mensagem deve possuir entre 1 e 300 caracteres.');
		}
	};
	
	$scope.loadMessages = function() {
		$scope.messageLoading = true;
		$http({
			method : 'GET',
			url : 'messageToCouple/getAll'
		}).success(function(data) {
			$scope.messageList = data;
			$scope.messageLoading = false;
		}).error(function(data) {
			
		});
	};
	
	$scope.showAlert = function(text) {
		$mdDialog.show(
				$mdDialog.alert()
					.clickOutsideToClose(true)
					.title(text)
					.ariaLabel(text)
					.ok('OK')
		);
	};
	
}]);