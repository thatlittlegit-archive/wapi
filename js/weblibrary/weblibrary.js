var css = "css";
var js = "javascript";

function Ink(){
  var add = function(){
    easyImport(js, "https://cdn.jsdelivr.net/ink/3.1.9/js/ink.min.js");
    easyImport(css, "https://cdn.jsdelivr.net/ink/3.1.9/css/ink.min.css");
  };
}
function ScriptAculoUs(){
  var version;

  var add = function(){
    if(version !== undefined){
      easyImport(js, "https://ajax.googleapis.com/ajax/libs/scriptaculous/" + version + "/scriptaculous.js");
    } else {
      easyImport(js, "https://ajax.googleapis.com/ajax/libs/scriptaculous/1.9.0/scriptaculous.js");
    }
  };
}
function Prototype(){
  var version;

  var add = function(){
    if(version !== undefined){
      easyImport(js, "https://ajax.googleapis.com/ajax/libs/prototype/" + version + "/prototype.js");
    } else {
      easyImport(js, "https://ajax.googleapis.com/ajax/libs/prototype/1.7.2.0/prototype.js");
    }
  };
}
function Slick(){
  var add = function(){
    easyImport(js, "https://cdn.jsdelivr.net/jquery.slick/1.5.6/slick.min.js");
    easyImport(css, "https://cdn.jsdelivr.net/jquery.slick/1.5.6/slick.css");
  };
}
function ExtCore(){
  var too = true; // Three.one.zero, or 3.1.0 (there's only 2 versions)

  var add = function(){
    if(too === true){
      easyImport(js, "https://ajax.googleapis.com/ajax/libs/ext-core/3.1.0/ext-core.js");
    } else {
      easyImport(js, "https://ajax.googleapis.com/ajax/libs/ext-core/3.0.0/ext-core.js");
    }
  };
}
function Dojo(){
  var version;

  var add = function(){
    var url = "https://ajax.googleapis.com/ajax/libs/dojo/1.10.4/dojo/dojo.js";
    if(version !== undefined){
      url = "https://ajax.googleapis.com/ajax/libs/dojo/" + version + "/dojo/dojo.js";
      easyImport(js, url);
    } else {
      easyImport(js, url);
    }
  };
}
function MooTools(){
  var version;

  var add = function(){
    var url = "https://ajax.googleapis.com/ajax/libs/mootools/1.5.1/mootools-yui-compressed.js";
    if(version !== undefined){
      url = "https://ajax.googleapis.com/ajax/libs/mootools/" + version + "/mootools-yui-compressed.js";
    }
    easyImport(js, url);
  };
}
function AngularJs(){
  var version;

  var add = function(){
    var url = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js";
    if(version !== undefined){
      url = "https://ajax.googleapis.com/ajax/libs/angularjs/" + version + "/angular.min.js";
    }
    easyImport(js, url);
  };
}
function jQuery(){
  var version;

  var add = function(){
      var url = "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js";
      if(version !== undefined){
        if(parseFloat(version) == 2 || parseFloat(version) == 1){
          switch(parseFloat(version)){
            case 1:
              easyImport(js, "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js");
            break;
            case 2:
              easyImport(js, "https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js");
            break;
          }
        } else {
          url = "https://ajax.googleapis.com/ajax/libs/jquery/" + version + "/jquery.min.js";
          easyImport(js, url);
        }
    } else {
      easyImport(js, "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js");
    }
  };
}
function Foundation(){
  var add = function(){
      easyImport(js, "https://cdn.jsdelivr.net/foundation/5.5.1/js/foundation.min.js");
      easyImport(css, "https://cdn.jsdelivr.net/foundation/5.5.1/css/foundation.min.css");
  };
}
function Bootstrap(){
  var useTheme;
  var legacy_noIcons = false; // Legacy because only 2.x supports it
  var version;

  var add = function(){
    switch(version){
      case 3 || undefined:
        easyImport(css, "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css");
        if(bootstrap_useTheme === true){
          easyImport(css, "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css");
        }
        easyImport(js, "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js");
      break;
      case 2:
        if(bootstrap_legacy_noIcons === true){
          easyImport(css, "https://maxcdn.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css");
        } else {
          easyImport(css, "https://maxcdn.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css");
        }
        easyImport(js, "https://maxcdn.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js");
      break;
    }
  };
}
function Yaml(){
  var add = function(){
    easyImport(css, "https://cdn.jsdelivr.net/yaml/4.1.1/core/base.min.css");
    easyImport(css, "https://cdn.jsdelivr.net/yaml/4.1.1/core/iehacks.min.css");
  };
}
/*
   Gumby would be here, however Sass is needed and neither Sass or SCSS
   are supported by WebLibrary. I would include it, however Sass is needed.
   (in fact, I think Gumby might be cool to have.)
   If someone (not me, I'm too lazy and don't know how) feels like making one,
   go ahead. It needs to convert JSON to a Gumby-readable format. Also, try
   using Fetch instead of XMLHttpRequest (AJAX).

   Please note you ARE allowed to use Gumby on your site; it's just not here.
   - wapidstyle
*/
function TukTuk(){
  var noIcons = false;
  var useTheme;

  var add = function(){
    easyImport(css, "http://cdn.jsdelivr.net/tuktuk/0.7.4/tuktuk.css");
    easyImport(js, "http://cdn.jsdelivr.net/tuktuk/0.7.4/tuktuk.js");
    if(noIcons === false){
      easyImport(css, "http://cdn.jsdelivr.net/tuktuk/0.7.4/tuktuk.icons.css");
    }
    if(useTheme === true){
      easyImport(css, "http://cdn.jsdelivr.net/tuktuk/0.7.4/tuktuk.theme.css");
    }
  };
}
function Pure(){
  var add = function(){
    easyImport(css, "http://cdn.jsdelivr.net/pure/0.6.0/pure-min.css");
  };
}
