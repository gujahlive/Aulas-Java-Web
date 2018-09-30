<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar</title>
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
	<jsp:include page="cabecalho.jsp"></jsp:include>
	<form action="SalvoCadastro.jsp" method="post">
	<label>Nome</label>
	<input type="text" name="nome"/>
	<label>Email</label>
	<input type="text" name="email"/>
	<label>Senha</label>
	<input type="password" name="senha"/>
	<label>Data Inscricao</label>
	<input type="text" name="datainscricao" OnKeyPress="formatar('##/##/####',this)" /><br/>
	<input type="submit" value="Cadastrar"/>
	</form>
</body>
</html>