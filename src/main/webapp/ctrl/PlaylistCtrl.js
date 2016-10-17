WeddingApp.controller('PlaylistCtrl', [
		'$scope',
		'$http',
		function($scope, $http) {

			$scope.obj = {
				selectType : '',
				selectFilter : '',
				searchUrl : ''
			};

			$scope.artistList = [];
			$scope.artist = {
				artistId : '',
				artistExternalUrl : '',
				artistApiUrl : '',
				artistName : '',
				imgSrc : '',
				imgWidth : 0,
				imgHeight : 0
			};

			$scope.search = function() {

				// if($scope.data.selectType == 'track') {
				// console.log('Musica: ' + $scope.data.selectType);
				// } else if($scope.data.selectType == "album") {
				// console.log('Album: ' + $scope.data.selectType);
				// } else if($scope.data.selectType == "artist") {
				// console.log('Artista: ' + $scope.data.selectType);
				// } else {
				// console.log('Nao caiu no IF: ' + $scope.data.selectType);
				// }
				
				$scope.artistList = [];

				$scope.searchUrl = 'https://api.spotify.com/v1/search?q='
						+ $scope.obj.selectFilter + '&type='
						+ $scope.obj.selectType;

				$http({
					method : 'GET',
					url : $scope.searchUrl
				}).success(function(data) {
					console.log('SUCESSO:');
					convertToArtistObject(data);
				}).error(function(data) {
					console.log('ERRO:');
					console.log($scope.obj.selectFilter);
					console.log($scope.obj.selectType);
					console.log(data);
				});
			};

			var convertToArtistObject = function(data) {
				if(data != null && angular.isDefined(data)){
					angular.forEach(data.artists.items, function(value, key){;
						
						$scope.artist.artistId = angular.isDefined(value.id) ? value.id : null;
						$scope.artist.artistExternalUrl = angular.isDefined(value.external_urls) ? value.external_urls.spotify : null;
						$scope.artist.artistApiUrl = angular.isDefined(value.href) ? value.href : null;
						$scope.artist.artistName = angular.isDefined(value.name) ? value.name : null;
						
						if(value.images != null && value.images != undefined && value.images.length > 0){
							angular.forEach(value.images, function(valImg, key){
								$scope.artist.imgSrc = angular.isDefined(valImg.url) ? valImg.url : null;
								$scope.artist.imgWidth = angular.isDefined(valImg.width) ? valImg.width : 0;
								$scope.artist.imgHeight = angular.isDefined(valImg.height) ? valImg.height : 0;
							});
						}
						if($scope.artist.artistId != null && $scope.artist.artistName != null){
							$scope.artistList.push($scope.artist);
						}
						
						$scope.artist = {
							artistId : '',
							artistExternalUrl : '',
							artistApiUrl : '',
							artistName : '',
							imgSrc : '',
							imgWidth : 0,
							imgHeight : 0
						};
					});
				}
			};
		} ]);