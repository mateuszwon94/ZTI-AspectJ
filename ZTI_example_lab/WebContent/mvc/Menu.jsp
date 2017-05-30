<table>
<tr>
<td><a href="SimpleMVC">Home</a></td>
<td><a href="SimpleMVC?site=Site1">Site 1</a></td>
<td><a href="SimpleMVC?site=Site2">Site 2</a></td>
<td><a href="SimpleMVC?site=Site3">Site 3</a></td>
</tr>
</table>

<script>
function myFunc(val) {
        var form = document.createElement('form');
        form.setAttribute('method', 'post');
        form.setAttribute('action', 'SimpleMVC');
        form.style.display = 'none';
        var inp = document.createElement('input');
        inp.setAttribute('type','text');
        inp.setAttribute('value',val);
        inp.setAttribute('name','site');
        inp.style.display = 'none';
        form.appendChild(inp);
        document.body.appendChild(form)
        form.submit();
}
</script>
<table>
    <tr>
        <td><input type="button" value="Home" onClick=myFunc('')></td>
        <td><input type="button" value="Site1" onClick=myFunc('Site1')></td>
        <td><input type="button" value="Site2" onClick=myFunc('Site2')></td>
        <td><input type="button" value="Site3" onClick=myFunc('Site3')></td>
    </tr>
</table>