<%@ page import="java.sql.Date" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.DateFormat" %>

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
String sdatainscricao = request.getParameter("datainscricao");
try{
SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
Date data = new Date(format.parse(sdatainscricao).getTime());

Usuario user = new Usuario();
user.setNome(snome);
user.setEmail(semail);
user.setSenha(ssenha);
user.setDatainscricao(data);
UsuarioDAO userDAO = new UsuarioDAO();
userDAO.cadastrar(user);
}catch(ParseException e){
	out.print("Erro na data -"+e.getMessage());
}



%>
<h1>SALVO COM SUCESSO!!!</h1>
</body>
</html>