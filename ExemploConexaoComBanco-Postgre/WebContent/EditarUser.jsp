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
<script>
function formatar(mascara, documento){
	var i = documento.value.length;
	var saida = mascara.substring(0,1);
	var texto = mascara.substring(i);
	if(texto.substring(0,1) != saida){
		documento.value += texto.substring(0,1);
	}
}

</script>


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
	<label>Data Inscricao</label>
	<input type="text" name="datainscricao" OnKeyPress="formatar('##/##/####',this)" value="<%=user.getDatainscricao() %>"/><br/>
	
	<input type="submit" value="Salvar"/>
	</form>
</body>
</html>