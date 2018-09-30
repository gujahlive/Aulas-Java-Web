<%@ page import="br.com.exemplo.postagre.beans.Usuario" %>
<%@ page import="br.com.exemplo.controller.UsuarioController" %>
<%@ page import="br.com.exemplo.postgre.UsuarioDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina inicial</title>
</head>
<body>
<jsp:include page="cabecalho.jsp"></jsp:include>
<h1>Curso JAVA WEB</h1>
<%
Usuario usuerAutenticado = (Usuario)session.getAttribute("userAutenticado");
out.print("Seja Bem vindo!"+usuerAutenticado.getNome());
%>
</body>
</html>