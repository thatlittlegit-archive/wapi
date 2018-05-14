# Web Libraries

## `standard.css`
`standard.css` provides a selection of useful CSS classes. See the file for the
classes.

## JavaScript Libraries
These are, effectively, relics of the old times of wAPI. These used to be huge,
OOP-using behemoths! Now, they have shrunk to singular functions, with 10 lines
of code.

### Importer
Imports elements into tags. Previously used BetterElement, now iterates over tags.

#### Usage
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

### WebLibrary
**Deprecated.** Please use manual `<script>` and `<link>` tags. *WebLibrary does NOT use SRI!*

*Depends on ImportElement*.

Loads libraries in an array or string from a predefined object.

#### Usage
```js
loadLibraries(["jquery", "mootools"]); // loads jQuery and MooTools
loadLibraries(["jquery"]);             // loads jQuery
loadLibraries("jquery");               // loads jQuery
```

### ImportElement
**Deprecated.** Please use manual `<script>` and `<link>` tags. *ImportElement does NOT support SRI!*

Import `<script>` or `<link>`s via JavaScript.

#### Usage
```js
importResource('js', 'index.js', true, 'body'); // Imports index.js asynchronously to <body>
importResource('js', 'index.js', true);         // Imports index.js asynchronously
importResource('js', 'index.js');               // Imports index.js
importResource('css', 'index.css');             // Imports index.css (works with all shown above)
```
