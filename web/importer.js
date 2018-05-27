/*
 * Importer 2.0.0 by thatlittlegit
 */

// eslint-disable-next-line no-unused-vars
function aliasElementToUrl(elementName, url) {
	fetch(url)
		.then(function (response) {
			return response.text();
		})
		.then(function (text) {
			[...document.getElementsByTagName(elementName)].forEach(function (element) {
				element.innerHTML = text;
			});
		});
}

// RIP elaborate XML-to-JSON thing that probably didn't work
