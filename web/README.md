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
