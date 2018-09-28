<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CapturarDado.jsp" method="post"><!-- get passa dados menores e mostra na url, post passa maiores dados e não mostra as informações passa de forma oculta -->>
	Nome:<input type="text" name="nome">
	<input type="submit" value="Enviar"/><br>
</form>
<% 
String nome = request.getParameter("nome");//pega o parametro do name do input
if(nome!=null)
out.print("Bem vindo,"+nome);
%>
</body>
</html>