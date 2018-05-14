function importResource(type, location, async, appendTo) {
	switch(type){
		case "css":
			var elem = document.createElement('link');
			elem.setAttribute("rel", "stylesheet");
			elem.setAttribute("href", src);

		break;
		case "javascript":
			var elem = document.createElement('script');
			elem.setAttribute("type", "text/javascript");
			elem.setAttribute("src", src);
		break;
		default:
			throw new Error('No type specified!');
	}

	if (async === true) {
		elem.setAttribute("async", "true");
	}

	document.querySelector(appendTo).append(elem);
}
