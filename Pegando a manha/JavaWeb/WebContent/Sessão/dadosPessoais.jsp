<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String usuario = (String) session.getAttribute("usuario");//se o usuario existir ele recebe por parametro, senao pasa nulo -
	                                                          //precisa do cast pois o metodo retorna um objeto, precisa converter;
	      if(usuario == null){
	    	  response.sendRedirect("login.jsp");//se ele for nulo volta pra home
	      }else{
	    	  out.print("Bem vindo: "+usuario+"<br/>");
	      }                                                    
%>
conta : 1344<br/>
<a href="deslogar.jsp">Deslogar</a>

</body>
</html>