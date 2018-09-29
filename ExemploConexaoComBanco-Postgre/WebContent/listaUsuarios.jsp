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
<title>Insert title here</title>
</head>
<body>
<jsp:include page="cabecalho.jsp"></jsp:include>
<%

//List<Usuario> lista = userDAO.buscarTodos(user);
List<Usuario> listaResult = (List<Usuario>)request.getAttribute("lista");// variavel referente ao servlet
for(Usuario u : listaResult) {
	out.println("id: "+u.getId()+"nome: "+u.getNome()+"email: "+u.getEmail()+"senha: "+u.getSenha());//u é a variavel do for que compara com o resultado da lista
}

%>
</body>
</html>