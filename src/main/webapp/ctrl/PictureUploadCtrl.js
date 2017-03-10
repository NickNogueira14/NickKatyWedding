WeddingApp.controller('PictureUploadCtrl', ['$scope', '$mdDialog', function($scope, $mdDialog) {
	
	$scope.photoList = [
	                    {index : 0, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture01.jpg'},
	                    {index : 1, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture02.jpg'},
	                    {index : 2, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture03.jpg'},
	                    {index : 3, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture04.jpg'},
	                    {index : 4, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture05.jpg'},
	                    {index : 5, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture06.jpg'},
	                    {index : 6, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture07.jpg'},
	                    {index : 7, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture08.jpg'},
	                    {index : 8, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture09.jpg'},
	                    {index : 9, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture10.jpg'},
	                    {index : 10, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture11.jpg'},
	                    {index : 11, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture12.jpg'},
	                    {index : 12, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture13.jpg'},
	                    {index : 13, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture14.jpg'},
	                    {index : 14, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture15.jpg'},
	                    {index : 15, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture16.jpg'},
	                    {index : 16, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture17.jpg'},
	                    {index : 17, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture18.jpg'},
	                    {index : 18, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture19.jpg'},
	                    {index : 19, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture20.jpg'},
	                    {index : 20, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture21.jpg'},
	                    {index : 21, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture22.jpg'},
	                    {index : 22, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture23.jpg'},
	                    {index : 23, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture24.jpg'},
	                    {index : 24, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture25.jpg'},
	                    {index : 25, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture26.jpg'},
	                    {index : 26, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture27.jpg'},
	                    {index : 27, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture28.jpg'},
	                    {index : 28, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture29.jpg'},
	                    {index : 29, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture30.jpg'},
	                    {index : 30, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture31.jpg'},
	                    {index : 31, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture32.jpg'},
	                    {index : 32, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture33.jpg'},
	                    {index : 33, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture34.jpg'},
	                    {index : 34, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture35.jpg'},
	                    {index : 35, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture36.jpg'},
	                    {index : 36, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture37.jpg'},
	                    {index : 37, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture38.jpg'},
	                    {index : 38, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture39.jpg'},
	                    {index : 39, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture40.jpg'},
	                    {index : 40, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture41.jpg'},
	                    {index : 41, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture42.jpg'},
	                    {index : 42, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture43.jpg'},
	                    {index : 43, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture44.jpg'},
	                    {index : 44, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture45.jpg'},
	                    {index : 45, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture46.jpg'},
	                    {index : 46, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture47.jpg'},
	                    {index : 47, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture48.jpg'},
	                    {index : 48, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture49.jpg'},
	                    {index : 49, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture50.jpg'},
	                    {index : 50, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture51.jpg'},
	                    {index : 51, path : 'https://storage.googleapis.com/nick-katy.appspot.com/pictures/picture52.jpg'}
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