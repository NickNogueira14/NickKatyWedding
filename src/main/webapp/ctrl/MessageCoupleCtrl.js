WeddingApp.controller('MessageCoupleCtrl',
				['$scope','$http', '$interval', function($scope, $http, $interval) {
	
	$scope.message = {
			messageContent : null,
			messageAuthor : null,
			messageCreate : null
	};
	
	$scope.messageLoading = false;
	
	$scope.messageList = [];
	
	$scope.sendMessage = function() {
		
		$scope.messageLoading = true;
		
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
			$scope.messageLoading = false;
		}).error(function(data) {
			$scope.messageLoading = false;
			console.log('ERRO: ' + data);
		});
		
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
	
}]);