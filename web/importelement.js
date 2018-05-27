// eslint-disable-next-line no-unused-vars
function importResource(type, location, async, appendTo) {
	let elem;
	switch (type) {
		case 'css':
			elem = document.createElement('link');
			elem.setAttribute('rel', 'stylesheet');
			elem.setAttribute('href', location);
			break;
		case 'javascript':
			elem = document.createElement('script');
			elem.setAttribute('type', 'text/javascript');
			elem.setAttribute('src', location);
			break;
		default:
			throw new Error('No type specified!');
	}

	if (async === true) {
		elem.setAttribute('async', 'true');
	}

	document.querySelector(appendTo).append(elem);
}
