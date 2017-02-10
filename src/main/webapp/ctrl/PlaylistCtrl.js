WeddingApp.controller('PlaylistCtrl',
		['$scope','$http', '$mdDialog', function($scope, $http, $mdDialog) {

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
					artistSpotifyUri : '',
					artistName : '',
					imgSrc : '../images/icons/artist.png',
					imgWidth : 0,
					imgHeight : 0
			};

			$scope.albumList = [];
			$scope.album = {
					albumId : '',
					albumExternalUrl : '',
					albumApiUrl : '',
					albumSpotifyUri : '',
					albumName : '',
					artistName : '',
					imgSrc : '../images/icons/album.png',
					imgWidth : 0,
					imgHeight : 0
			};

			$scope.trackList = [];
			$scope.track = {
					trackId : '',
					trackExternalUrl : '',
					trackApiUrl : '',
					trackSpotifyUri : '',
					trackName : '',
					imgSrc : '../images/icons/track.png',
					imgWidth : 0,
					imgHeight : 0
			};

			$scope.resetSearch = function() {
				$scope.obj.selectFilter = '';
				$scope.obj.searchUrl = '';
				resetSpotifyFields();
			}
			
			var resetSpotifyFields = function() {
				$scope.artistList = [];
				$scope.artist = {
						artistId : '',
						artistExternalUrl : '',
						artistApiUrl : '',
						artistSpotifyUri : '',
						artistName : '',
						imgSrc : '../images/icons/artist.png',
						imgWidth : 0,
						imgHeight : 0
				};
				$scope.albumList = [];
				$scope.album = {
						albumId : '',
						albumExternalUrl : '',
						albumApiUrl : '',
						albumSpotifyUri : '',
						albumName : '',
						artistName : '',
						imgSrc : '../images/icons/album.png',
						imgWidth : 0,
						imgHeight : 0
				};
				$scope.trackList = [];
				$scope.track = {
						trackId : '',
						trackExternalUrl : '',
						trackApiUrl : '',
						trackSpotifyUri : '',
						trackName : '',
						artistName : '',
						albumName : '',
						imgSrc : '../images/icons/track.png',
						imgWidth : 0,
						imgHeight : 0
				};
			}

			$scope.search = function() {
				$scope.messageLoading = true;
				
				resetSpotifyFields();
				$scope.searchUrl = 'https://api.spotify.com/v1/search?q='
									+ $scope.obj.selectFilter
									+ '&type='
									+ $scope.obj.selectType
									+ '&market=BR&limit=50';

				$http({
					method : 'GET',
					url : $scope.searchUrl
				}).success(function(data) {
						if (data != null && angular.isDefined(data)) {
							if ($scope.obj.selectType == 'track') {
								convertToTrackObject(data.tracks.items);
							} else if ($scope.obj.selectType == 'album') {
								convertToAlbumObject(data.albums.items);
							} else if ($scope.obj.selectType == 'artist') {
								convertToArtistObject(data.artists.items);
							} else {
								console.log('Nao caiu no IF: ' + $scope.data.selectType);
							}
						}
						
						$scope.messageLoading = false;
				}).error(function(data) {
						console.log('ERRO:');
						console.log($scope.obj.selectFilter);
						console.log($scope.obj.selectType);
						console.log(data);
						$scope.messageLoading = false;
				});
			};

			var convertToTrackObject = function(items) {
				angular.forEach(items, function(value, key) {
						$scope.track.trackId = angular.isDefined(value.id) 
												? value.id : null;
						$scope.track.trackExternalUrl = angular.isDefined(value.external_urls.spotify) 
												? value.external_urls.spotify : null;
						$scope.track.trackApiUrl = angular.isDefined(value.href) 
												? value.href : null;
						$scope.track.trackName = angular.isDefined(value.name) 
												? value.name : null;
						$scope.track.trackSpotifyUri = angular.isDefined(value.uri)
												? value.uri : null;

						if (value.artists != null && angular.isDefined(value.artists) && value.artists.length > 0) {
							angular.forEach(value.artists, function(valArtist, key) {
									if ($scope.track.artistName == null || $scope.track.artistName == '') {
										$scope.track.artistName = angular.isDefined(valArtist.name) 
												? valArtist.name : null;
									} else {
										$scope.track.artistName += angular.isDefined(valArtist.name) 
												? ' / ' + valArtist.name : '';
									}
							});
						}

						if ($scope.album.albumName != null && angular.isDefined($scope.album.albumName) && $scope.album.albumName != '') {
							$scope.track.albumName = $scope.album.albumName;
							$scope.track.imgSrc = angular.isDefined($scope.album.imgSrc) 
													? $scope.album.imgSrc : '../images/icons/track.png';
							$scope.track.imgWidth = angular.isDefined($scope.album.width) 
													? $scope.album.width : 0;
							$scope.track.imgHeight = angular.isDefined($scope.album.height) 
													? $scope.album.height : 0;
						} else {
							$scope.track.albumName = angular.isDefined(value.album.name) 
													? value.album.name : null;

							if (value.album.images != null && angular.isDefined(value.album.images) && value.album.images.length > 0) {
								angular.forEach(value.album.images, function(valAlbumImg, key) {
										$scope.track.imgSrc = angular.isDefined(valAlbumImg.url) 
																? valAlbumImg.url : '../images/icons/track.png';
										$scope.track.imgWidth = angular.isDefined(valAlbumImg.width) 
																? valAlbumImg.width : 0;
										$scope.track.imgHeight = angular.isDefined(valAlbumImg.height) 
																? valAlbumImg.height : 0;
								});
							}
						}

						if ($scope.track.trackId != null && $scope.track.trackName != null) {
							$scope.trackList.push($scope.track);
						}
						
						$scope.track = {
								trackId : '',
								trackExternalUrl : '',
								trackApiUrl : '',
								trackSpotifyUri : '',
								trackName : '',
								artistName : '',
								albumName : '',
								imgSrc : '../images/icons/track.png',
								imgWidth : 0,
								imgHeight : 0
						};
				});
			};

			var convertToAlbumObject = function(items) {
				angular.forEach(items, function(value, key) {
						$scope.album.albumId = angular.isDefined(value.id) 
												? value.id : null;
						$scope.album.albumExternalUrl = angular.isDefined(value.external_urls) 
												? value.external_urls : null;
						$scope.album.albumApiUrl = angular.isDefined(value.href) 
												? value.href : null;
						$scope.album.albumName = angular.isDefined(value.name) 
												? value.name : null;
						$scope.album.albumSpotifyUri = angular.isDefined(value.uri)
												? value.uri : null;

						if (value.artists != null && angular.isDefined(value.artists) && value.artists.length > 0) {
							angular.forEach(value.artists, function(valArtist, key) {
									if ($scope.album.artistName == null || $scope.album.artistName == '') {
										$scope.album.artistName = valArtist.name;
									} else {
										$scope.album.artistName += ' / '
																+ valArtist.name;
									}
							})
						}

						if (value.images != null && angular.isDefined(value.images) && value.images.length > 0) {
							angular.forEach(value.images, function(valImg, key) {
									$scope.album.imgSrc = angular.isDefined(valImg.url) 
															? valImg.url : '../images/icons/album.png';
									$scope.album.imgWidth = angular.isDefined(valImg.width) 
															? valImg.width : null;
									$scope.album.imgHeight = angular.isDefined(valImg.height) 
															? valImg.height	: null;
							});
						}
						if ($scope.album.albumId != null && $scope.album.albumName != null) {
							$scope.albumList.push($scope.album);
						}

						$scope.album = {
							albumId : '',
							albumExternalUrl : '',
							albumApiUrl : '',
							albumSpotifyUri : '',
							albumName : '',
							imgSrc : '../images/icons/album.png',
							imgWidth : 0,
							imgHeight : 0
						};
				});
			};

			var convertToArtistObject = function(items) {
				angular.forEach(items, function(value, key) {
						if (value.genres.length > 0) {
							$scope.artist.artistId = angular.isDefined(value.id) 
														? value.id : null;
							$scope.artist.artistExternalUrl = angular.isDefined(value.external_urls) 
														? value.external_urls.spotify : null;
							$scope.artist.artistApiUrl = angular.isDefined(value.href) 
														? value.href : null;
							$scope.artist.artistName = angular.isDefined(value.name) 
														? value.name : null;
							$scope.artist.albumSpotifyUri = angular.isDefined(value.uri)
														? value.uri : null;

							if (value.images != null && angular.isDefined(value.images) && value.images.length > 0) {
								angular.forEach(value.images, function(valImg, key) {
										$scope.artist.imgSrc = angular.isDefined(valImg.url) 
																? valImg.url : '../images/icons/artist.png';
										$scope.artist.imgWidth = angular.isDefined(valImg.width) 
																? valImg.width : 0;
										$scope.artist.imgHeight = angular.isDefined(valImg.height) 
																? valImg.height : 0;
								});
							}
							if ($scope.artist.artistId != null && $scope.artist.artistName != null) {
								$scope.artistList.push($scope.artist);
							}

							$scope.artist = {
								artistId : '',
								artistExternalUrl : '',
								artistApiUrl : '',
								artistSpotifyUri : '',
								artistName : '',
								imgSrc : '../images/icons/artist.png',
								imgWidth : 0,
								imgHeight : 0
							};
						}
				});
			};

			$scope.getAlbumsFromArtist = function(artist) {
				$scope.messageLoading = true;
				
				resetSpotifyFields();
				$scope.artistAlbumsUrl = 'https://api.spotify.com/v1/artists/'
											+ artist.artistId
											+ '/albums?album_type=album&market=BR&limit=50';

				$http({
					method : 'GET',
					url : $scope.artistAlbumsUrl
				}).success(function(data) {
						convertToAlbumObject(data.items);
						$scope.messageLoading = false;
				}).error(function(data) {
						console.log('ERRO:');
						console.log($scope.obj.selectFilter);
						console.log($scope.obj.selectType);
						console.log(data);
						$scope.messageLoading = false;
				});
			}

			$scope.getTracksFromAlbum = function(album) {
				$scope.messageLoading = true;
				
				resetSpotifyFields();
				$scope.albumTracksUrl = 'https://api.spotify.com/v1/albums/'
											+ album.albumId
											+ '/tracks?market=BR&limit=50';

				$http({
					method : 'GET',
					url : $scope.albumTracksUrl
				}).success(function(data) {
						$scope.album = album;
						convertToTrackObject(data.items);
						$scope.messageLoading = false;
				}).error(function(data) {
						console.log('ERRO:');
						console.log($scope.obj.selectFilter);
						console.log($scope.obj.selectType);
						console.log(data);
						$scope.messageLoading = false;
				});
			}
			
			$scope.getTopTracksFromArtist = function(artist) {
				$scope.messageLoading = true;
				
				resetSpotifyFields();
				$scope.topTracksUrl = 'https://api.spotify.com/v1/artists/'
										+ artist.artistId
										+ '/top-tracks?country=br';

				$http({
					method : 'GET',
					url : $scope.topTracksUrl
				}).success(function(data) {
						convertToTrackObject(data.tracks);
						$scope.messageLoading = false;
				}).error(function(data) {
						console.log('ERRO:');
						console.log($scope.obj.selectFilter);
						console.log($scope.obj.selectType);
						console.log(data);
						$scope.messageLoading = false;
				});
			}
			
			$scope.addTrackToPlaylist = function(track) {
				$scope.messageLoading = true;
				
				$http({
					method : 'GET',
					url : 'playlist/addTrackIntoPlaylist/' + track.trackSpotifyUri
				}).success(function(data) {
					$scope.messageLoading = false;
					$scope.showAlert('Música adicionada com sucesso!')
				}).error(function(data) {
					$scope.messageLoading = false;
					$scope.showAlert('Houve uma falha no sistema! Atualize a págna e tente novamente.')
				});
				
			}
			
			$scope.showAlert = function(text) {
				$mdDialog.show(
					$mdDialog.alert()
						.clickOutsideToClose(true)
						.title(text)
						.ariaLabel(text)
						.ok('OK')
				);
			}

} ]);

WeddingApp.directive('ngEnter', function () {
    return function (scope, element, attrs) {
        element.bind("keydown keypress", function (event) {
            if(event.which === 13) {
                scope.$apply(function (){
                    scope.$eval(attrs.ngEnter);
                });
 
                event.preventDefault();
            }
        });
    };
});