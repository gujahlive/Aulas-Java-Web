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

%>

<table border="1">
<tr bgcolor="#eaeaea">
	<th>ID</th>
	<th>Nome</th>
	<th>Email</th>
	<th>Senha</th>
	<th>Excluir</th>
	<th>Editar</th>
</tr>
<%
for(Usuario u : listaResult) {
%>
<tr >
	<td><%=u.getId() %></td>
	<td><%=u.getNome() %></td>
	<td><%=u.getEmail() %></td>
	<td><%=u.getSenha() %></td>
	<th><a href="UsuarioController?acao=delete&id=<%=u.getId() %>">DELETAR</a></th>
	<th><a href="UsuarioController?acao=editar&id=<%=u.getId() %>">EDITAR</a></th>
</tr>

<%	
}
%>

</table>

</body>
</html>