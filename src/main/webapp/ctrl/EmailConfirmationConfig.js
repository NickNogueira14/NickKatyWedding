WeddingApp.config(function($mdThemingProvider) {
	
	var tiffanyBlueMap = $mdThemingProvider.extendPalette('light-blue', {
		'500': '#0ABAB5',
		'contrastDefaultColor': 'dark'
	});
	
	$mdThemingProvider.definePalette('tiffanyBlue', tiffanyBlueMap);
	
	$mdThemingProvider.theme('default')
		.primaryPalette('tiffanyBlue')
		.dark();
})