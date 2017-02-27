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
you'll need to install it through [gradle.org](gradle.org). Once
you have it installed, run:
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
Please note that JSHint almost **only checks for syntax errors**. A tool may be
made in future to improve this, however for now it will only check syntax.

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
##### Gradle
```groovy
repositories {
    maven {
        name 'wapi'
        url 'http://wapidstyle.bitbucket.io/'
    }
}

dependencies {
    compile "wapidstyle:wapi:1.0.3"
}
```
##### Maven
```xml
<repositories>
    <repository>
        <id>wapi</id>
        <url>http://wapidstyle.bitbucket.io/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>wapidstyle</groupId>
        <artifactId>wapi</artifactId>
        <version>1.0.3</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```
##### Ant
No clue -- feel free to contribute!
##### `javac`
**You have GOT to be kidding me.**

Please, just [get an IDE](https://en.wikipedia.org/wiki/Comparison_of_integrated_development_environments#Java).

### JavaScript
#### Node.js Modules
```shell
REM On Windows
gradlew js-install

# On Linux/macOS/BSD/Solaris/every good OS *ever*
./gradlew js-install
```
#### HTML
Embed this into your HTML:
```html
<script src="https://bitbucket.org/wapidstyle/wapi/raw/master/js/project_name/project_name.js"></script>
```

### CSS
```html
<link rel="stylesheet" href="https://bitbucket.org/wapidstyle/wapi/raw/master/css/standard.css">
```
## Contributing
Simply fork the project and follow the terms in CONTRIBUTING.md.
### Contributors
Currently, there are 1. :unamused: Try contributing!
* [wapidstyle](https://github.com/wapidstyle) 
