# wAPI

wAPI is an API made by [wapidstyle](https://github.com/wapidstyle) for the original purpose of
making plugins for Bukkit easier. Later, it morphed into an interface for CSS, Java and JavaScript
containing multiple modules and a Java interface. Modules letting you import, use preset imports,
and make HTML elements. Modules making website styles, like centering objects, easy. It became a
network of modules, connected through wAPI. Like an atom, all the electrons and neutrons, brought
together by the nucleus. Using the atom theory, the modules (electrons and neutrons) are brought
together by wAPI.

> Fact: this readme was made in a text editor called... Atom.

## Building
### Java
Use Gradle to build Java.
```shell
gradle assemble
```
The build.gradle is supplied.
### JavaScript
Uses jshint. To install it, use `npm install jshint`. (NPM required.)
```shell
jshint js/weblibrary/weblibrary.js
```

> JShint does not strictly 'build' the JS, it checks it because JavaScript is interpreted. If
> you need it in an application, you can use Electron or NW.js. (Or JSC, but that won't work.)

### CSS
Uses csslint. To install it, use `npm install csslint`. (NPM required.)
```shell
csslint css/standard.css
```

> Like JavaScript, csslint does not build the css because CSS is interpreted. Plus, I don't know
> why you would build CSS.

## Installing
### Java
Reference wAPI in your build path in your IDE.
### JavaScript
```html
<script src="https://raw.githubusercontent.com/wapidstyle/wapi/master/js/project_name/project_name.js"></script>
```
### CSS
```html
<link rel="stylesheet" href="https://raw.githubusercontent.com/wapidstyle/wapi/master/css/sheet_name.css">
```
## Contributors
* [wapidstyle](https://github.com/wapidstyle)
* Your Name Here
