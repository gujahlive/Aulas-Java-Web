<%@ page import="br.com.exemplo.postagre.beans.Usuario" %>
<%@ page import="br.com.exemplo.postgre.UsuarioDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salvar Cadastro</title>
</head>
<body>
<jsp:include page="cabecalho.jsp"></jsp:include>
<%
String snome = request.getParameter("nome");
String semail = request.getParameter("email");
String ssenha = request.getParameter("senha");

Usuario user = new Usuario();
user.setNome(snome);
user.setEmail(semail);
user.setSenha(ssenha);

UsuarioDAO userDAO = new UsuarioDAO();
userDAO.cadastrar(user);



%>
<h1>SALVO COM SUCESSO!!!</h1>
</body>
</html>