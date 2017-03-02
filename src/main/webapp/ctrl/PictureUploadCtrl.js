WeddingApp.controller('PictureUploadCtrl', ['$scope', '$mdDialog', function($scope, $mdDialog) {
	
	$scope.photoList = [
	                    {index : 0, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture01.JPG'},
	                    {index : 1, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture02.JPG'},
	                    {index : 2, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture03.JPG'},
	                    {index : 3, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture04.JPG'},
	                    {index : 4, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture05.JPG'},
	                    {index : 5, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture06.JPG'},
	                    {index : 6, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture07.JPG'},
	                    {index : 7, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture08.JPG'},
	                    {index : 8, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture09.JPG'},
	                    {index : 9, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture10.JPG'},
	                    {index : 10, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture11.jpg'}
	                    ];
	
	$scope.picture = null;

	$scope.showPhotoBig = function(ev, pic) {
		$scope.picture = angular.copy(pic);
		
	    $mdDialog.show({
	    	scope: $scope.$new(),
	    	templateUrl: 'pages/pictureModal.html',
	    	parent: angular.element(document.body),
	    	targetEvent: ev,
	    	clickOutsideToClose:true,
	    	fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
	    });
	}
	
	$scope.nextPicture = function(evt) {
		
		$mdDialog.hide();
		
		var index = $scope.picture.index;
		if(index < $scope.photoList.length - 1) {
			var photo = $scope.photoList[index + 1];
		} else {
			var photo = $scope.photoList[0];
		}
		
		$scope.showPhotoBig(evt, photo);
	}
	
	$scope.previousPicture = function(evt) {
		
		$mdDialog.hide();
		
		var index = $scope.picture.index;
		if(index > 0) {
			var photo = $scope.photoList[index - 1];
		} else {
			index = $scope.photoList.length - 1;
			var photo = $scope.photoList[index];
		}
		
		$scope.showPhotoBig(evt, photo);
	}
	
}]);