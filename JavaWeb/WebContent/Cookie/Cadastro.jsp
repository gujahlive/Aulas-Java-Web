<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Cookies.jsp">
	Nome:
	<input type="text" name="nome"/>
	<input type="submit" value="Enviar"/>
	</form>
	<%
		Cookie[] cookies = request.getCookies();// verifica inicialmente se já existe um cookie  na instancia
		// criasse um vetor para pecorrer o retorno do cookie
		for(Cookie atual: cookies){
			if(atual.getName().equals("nomeUsuario")){
				response.sendRedirect("Cookies.jsp");//passa por parmetro a pagina que quer redirecionar
			}
		}
	
	%>
</body>
</html>