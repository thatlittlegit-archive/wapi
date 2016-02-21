### This branch is **discontinued**. Use `master` instead.
# wAPI

wAPI is an API made by [wapidstyle](https://github.com/wapidstyle) for the original purpose of
making plugins for Bukkit easier. Later, it morphed into an interface for CSS, Java and JavaScript
containing multiple modules and a Java interface. Modules letting you import, use preset imports,
and make HTML elements. Modules making website styles, like centering objects, easy. It became a
network of modules, connected through wAPI. Like an atom, all the electrons and neutrons, brought
together by the nucleus. Using the atom theory, the modules (electrons and neutrons) are brought
together by wAPI.

> Fact: this readme was made in a text editor called... Atom.

## Building the Java
Use Gradle to build the Java. If you don't have Gradle installed,
~~install it from gradle.org~~ use the wrapper by replacing `gradle`
with `gradlew`. The wrapper and build.gradle is supplied.
```shell
gradle assemble
```

## Validation of the Web modules
### JavaScript
Use `jshint`, installable from [NPM](https://www.npmjs.com/package/jshint). To
install it, use `npm install jshint`.

To validate:
```shell
jshint js/project-name/project-name.js
```
Note that it is not a *perfect* validation. It ***does not*** check for
missing functions, etc.

### CSS
Uses csslint, installable from [NPM](https://www.npmjs.com/package/csslint). To
install it, use `npm install csslint`.
```shell
csslint css/standard.css
```

## Installing
### Java
#### IDEs
Reference wAPI in your build path in your IDE. Check your IDE's instructions for how to do so.
#### No IDE
I'm going to keep it simple: **GET AN IDE.** An IDE is VERY simple to use, and many support multiple
languages. I know NetBeans, a Java IDE, supports HTML5, PHP, C++, C AND Java. Atom, what I'm using
to type this, supports a lot of languages and has a lot of addons. Eclipse, an extremely popular IDE,
has Markdown and quite a few versions for other languages. So **get one**.
### :bulb: Tip for the JS and CSS
If you don't want all the URL stuff, then either:
* make a [bit.ly](bit.ly)
* clone the project and reference the JS/CSS folder.
### JavaScript

```html
<script src="https://raw.githubusercontent.com/wapidstyle/wapi/master/js/project_name/project_name.js"></script>
```
### CSS
```html
<link rel="stylesheet" href="https://raw.githubusercontent.com/wapidstyle/wapi/master/css/sheet_name.css">
```
## Contributing
Simply fork the project and follow the terms in CONTRIBUTING.md.
### Contributors
Currently, there are 1. :unamused: Try contributing!
* [wapidstyle](https://github.com/wapidstyle)
