# JavaScript Components
These are, effectively, relics of the old times of wAPI. These used to be huge,
OOP-using behemoths! Now, they have shrunk to singular functions, with 10 lines
of code.

---
## Importer
Imports elements into tags. Previously used BetterElement, now iterates over tags.

## Usage
```html
<!-- index.html -->
<topbar></topbar>
<!-- bar.html -->
foo
```
with
```js
aliasElementToUrl('topbar', 'bar.html');
```
results in
```html
<!-- index.html -->
<topbar>foo</topbar>
```

## WebLibrary
**Deprecated.** Please use manual `<script>` and `<link>` tags. *WebLibrary does NOT support SRI!*

Loads libraries in an array or string from a predefined object.

### Usage
```js
loadLibraries(["jquery", "mootools"]); // loads jQuery and MooTools
loadLibraries(["jquery"]);             // loads jQuery
loadLibraries("jquery");               // loads jQuery
```
