<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Dados.jsp">
		País:
		<select name="pais">
			<option>Brasil</option>
			<option>Argetina</option>
			<option>EUA</option>
			<option>Rússia</option>
			<option>Japão</option>
		</select>
		<br/><br/>
		Sexo:
		<input type="radio" name="sexo" value="Masculino"/>Masculino
		<input type="radio" name="sexo" value="Feminino"/>Feminino
		<br/><br/>
		Línguas:
		<input type="checkbox" name="linguas" value="Português"/>Português
		<input type="checkbox" name="linguas" value="Inglês"/>Inglês
		<input type="checkbox" name="linguas" value="Espanhol"/>Espanhol
		<input type="checkbox" name="linguas" value="Francês"/>Francês
		<br/><br/>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>