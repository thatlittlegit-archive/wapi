var css = "css";
var js = "javascript";

var libraries = {
	ink(version) {
		importResource(js, `https://cdn.jsdelivr.net/gh/sapo/Ink@${version || '3.1.10'}/dist/js/ink-all.min.js`);
		importResource(css, `https://cdn.jsdelivr.net/gh/sapo/Ink@${version || '3.1.10'}/dist/css/ink.min.css`);
	},
	scriptaculous(version) {
		importResource(js, `https://ajax.googleapis.com/ajax/libs/scripaculous/${version || '1.9.0'}/scriptaculous.js`);
	},
	prototype(version) {
		importResource(js, `https://ajax.googleapis.com/ajax/libs/prototype/${version || '1.7.3.0'}/prototype.js`);
	},
	slick(version) {
		let version = rawVersion || '1.8.1';
		importResource(js, `https://cdn.jsdelivr.net/npm/slick-carousel@${version}/slick/slick.min.js`);
		importResource(css, `https://cdn.jsdelivr.net/npm/slick-carousel@${version}/slick/slick.css`);
	},
	extCore(version) {
		importResource(js, `https://ajax.googleapis.com/ajax/libs/ext-core/${version || '3.1.0'}/ext-core.js`);
	},
	dojo(version) {
		importResource(js, `https://ajax.googleapis.com/ajax/libs/dojo/${version || '1.13.0'}/dojo/dojo.js`);
	},
	mootools(version) {
		importResource(js, `https://ajax.googleapis.com/ajax/libs/mootools/${version || '1.6.0'}/mootools.min.js`);
	},
	angular(version) {
		if (typeof version !== 'undefined' && version.startsWith('1')) {
			importResource(js, `https://ajax.googleapis.com/ajax/libs/angularjs/${version}/angular.min.js`);
		} else {
			importResource(js, `https://cdn.jsdelivr.net/npm/@angular/core@${version || '6.0.1'}/bundles/core.umd.min.js`);
		}
	},
	jquery(version) {
		importResource(js, `https://code.jquery.com/jquery-${version || '3.3.1'}.min.js`);
	},
	foundation(version) {
		importResource(js, `https://cdn.jsdelivr.net/gh/zurb/foundation-sites@${version || '6.4.3'}/dist/js/foundation.min.js`);
		importResource(css, `https://cdn.jsdelivr.net/gh/zurb/foundation-sites@${version || '6.4.3'}/dist/css/foundation.min.css`);
	},
	bootstrap(version) {
		importResource(js, `https://stackpath.bootstrapcdn.com/bootstrap/${version || '4.1.1'}/js/bootstrap.min.js`);
		importResource(css, `https://stackpath.bootstrapcdn.com/bootstrap/${version || '4.1.1'}/css/bootstrap.min.css`);
	},
	yaml(version) {
		importResource(css, `https://cdn.jsdelivr.net/gh/yamlcss/yaml@${version || '4.1.2'}/yaml/core/base.min.css`);
	},
	tuktuk(version) {
		importResource(css, `https://cdn.jsdelivr.net/gh/soyjavi/package-tuktuk@${version || '1.0.0'}/tuktuk.css`);
		importResource(css, `https://cdn.jsdelivr.net/gh/soyjavi/package-tuktuk@${version || '1.0.0'}/tuktuk.grid.css`);
		importResource(js, `https://cdn.jsdelivr.net/gh/soyjavi/package-tuktuk@${version || '1.0.0'}/tuktuk.js`);
	},
	pure(version) {
		importResource(css, `https://unpkg.com/purecss@${version || '1.0.0'}/build/pure-min.css`);
	}
}

function loadLibraries(libs) {
	(Array.isArray(libs) ? libs : [libs]).forEach(function(lib) {
		if (Array.isArray(lib)) {
			libraries[lib[0]](lib[1]);
		} else {
			libraries[lib]();
		}
	});
}