function ImportElement(){
  var type = "javascript_error";
  var src;
  var async = true;

  var appendTo = "head";

  var ie;

  var construct = function(){
    switch(type){
      case "css":
        this.type = "css";
        this.ie = document.createElement('link');
        this.ie.setAttribute("rel", "stylesheet");
        if(async === true){this.ie.setAttribute("async", "true");}
        this.ie.setAttribute("href", src);
      break;
      case "javascript" || "javascript_error":
        this.ie = document.createElement('script');
        this.ie.setAttribute("type", "text/javascript");
        this.ie.setAttribute("src", src);
        if(type === "javascript_error"){
          console.warn("ImportElement: No type specified, using JavaScript!")
        }
      break;
    }
  };

  var append = function(){
    document.getElementsByTagName(appendTo)[0].appendChild(this.element);
  };
}
function easyImport(type, src, appendTo){
  var element = new ImportElement();

  if(type !== undefined && src !== undefined){
    switch(type){
      case "js" || "javascript" || 0:
        element.type = "javascript";
        element.src = src;
        if(appendTo !== undefined){
          element.appendTo = appendTo;
        }
        element.construct();
      break;
      case "css" || "style" || "stylesheet" || 1:
        element.type = "css";
        element.src = src;
        if(appendTo !== undefined){
          element.appendTo = appendTo;
        }
        element.construct();
      break;
    }
  }
}
