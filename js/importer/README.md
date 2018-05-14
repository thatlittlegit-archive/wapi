# Importer
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
