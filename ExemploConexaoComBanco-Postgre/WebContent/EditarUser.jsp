<%@ page import="br.com.exemplo.postagre.beans.Usuario" %>
<%@ page import="br.com.exemplo.controller.UsuarioController" %>
<%@ page import="br.com.exemplo.postgre.UsuarioDAO" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar</title>
</head>
<body>
<%Usuario user = (Usuario)request.getAttribute("usuario");
%>	
	<jsp:include page="cabecalho.jsp"></jsp:include>
	
	<form action="UsuarioController" method="post">
	<label>ID</label>
	<input size="5" type="text" name="id" value="<%=user.getId() %>"/>	
	<label>Nome</label>
	<input type="text" name="nome" value="<%=user.getNome() %>"/>
	<label>Email</label>
	<input type="text" name="email" value="<%=user.getEmail() %>"/>
	<label>Senha</label>
	<input type="password" name="senha" value="<%=user.getSenha() %>"/>
	<input type="submit" value="Salvar"/>
	</form>
</body>
</html>