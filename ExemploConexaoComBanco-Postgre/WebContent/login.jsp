

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<fieldset>
<h1>Login</h1>
<form action="autenticador" method="post">
<label>Email: </label>
<input type="text" name="email"/><br/>
<label>Senha: </label>
<input type="password" name="senha"/><br/>
<input type="submit" value="Entrar">
</form>
</fieldset>
</body>
</html>