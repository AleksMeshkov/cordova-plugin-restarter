window.plugins = window.plugins || {};

window.plugins.webViewReloader = {
	reload: function() {
		return cordova.exec(function(winParam) {},
			function(error) {},
			"WebViewReloader",
			"reload", []);
	}
};