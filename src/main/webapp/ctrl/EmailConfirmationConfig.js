WeddingApp.config(function($mdThemingProvider) {
	
	var tiffanyBlueMap = $mdThemingProvider.extendPalette('light-blue', {
		'500': '#0ABAB5',
		'contrastDefaultColor': 'light',
		'contrastDarkColors': '#ffffff',
		'contrastLightColors': '#000000'
	});
	
	$mdThemingProvider.definePalette('tiffanyBlue', tiffanyBlueMap);
	
	$mdThemingProvider.theme('default')
		.primaryPalette('tiffanyBlue')
		.accentPalette('blue-grey')
		.dark();
})