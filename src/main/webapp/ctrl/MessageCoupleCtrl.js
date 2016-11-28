WeddingApp.controller('MessageCoupleCtrl',
				['$scope','$http', function($scope, $http) {
	
	$scope.message = {
			messageContent : null,
			messageAuthor : null,
			messageCreate : null
	};
	
	$scope.messageList = [];
	
	$scope.sendMessage = function() {
		
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
		}).error(function(data) {
			console.log('ERRO: ' + data);
		});
		
		console.log('MENSAGEM ENVIADA COM SUCESSO!');
	};
	
	$scope.loadMessages = function() {
		$http({
			method : 'GET',
			url : 'messageToCouple/getAll'
		}).success(function(data) {
			$scope.messageList = data;
		}).error(function(data) {
			
		});
	};
	
}]);