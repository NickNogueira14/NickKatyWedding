WeddingApp.controller('PictureUploadCtrl', ['$scope', function($scope) {
	
	$scope.fileName = '';
	
	$scope.selectFile = function(element, attrs) {
		document.getElementById('textInput').click();
	};
	
	$scope.getFileName = function() {
		var input = document.getElementById('textInput');
		$scope.fileName = document.getElementById('textInput').files[0].name;
		console.log($scope.fileName);
		
		if(document.getElementById('textInput').files[0].name != '' 
			|| document.getElementById('textInput').files[0].name != null) {
			
			var fReader = new FileReader();
			
			fReader.onload = function(){

				var img = document.getElementById("imageSelected");
				img.onload = function() {
					$scope.imgWidth = img.width;
					$scope.imgHeight = img.height;
					
					$scope.$apply();
				};
				img.src = fReader.result;
			}
			fReader.readAsDataURL(input.files[0]);
		}
		
		$scope.$apply();
	}
}]);