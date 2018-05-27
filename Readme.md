# wAPI
wAPI is a set of utilities made by [thatlittlegit](https://thatlittlegit.tk) originally
for making [Bukkit](https://bukkit.org) plugins. However, it's evolved past that to a
set of random utilities written in Java and JavaScript. They can now import elements and
scripts, run scripts and more.

## Compiling the Java
```shell
./gradlew assemble
```
The JAR file will be in `build/libs`.

## Installing
### Java
#### Gradle
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
#### Maven
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

### JavaScript
```html
<!-- Importer      --><script src="https://cdn.rawgit.com/thatlittlegit/wapi/master/web/importer.js"></script>
<!-- ImportElement --><script src="https://cdn.rawgit.com/thatlittlegit/wapi/master/web/importelement.js"></script>
```

### CSS
```html
<link rel="stylesheet" href="https://cdn.rawgit.com/thatlittlegit/wapi/master/web/standard.css">
```
