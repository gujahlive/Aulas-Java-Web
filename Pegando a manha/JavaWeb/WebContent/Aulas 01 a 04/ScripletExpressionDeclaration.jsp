<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"  %><!-- importando com o @ -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!//Declaration - Declara��o dos met�dos, utiliza-se a exclama��o para 
// determinar que � uma parte de declara��es e sempre vem antes do Scriplet, que s�o os scripts
int somarNumeros(int n1, int n2){
	return n1+n2;
}
%>
Soma:
<%=//Expression - Retorna conteudos dos metodos e dos objetos
somarNumeros(8,5)//retorna o resultado do metodo, se fosse um objeto retornaria uma true string do objeto
%>
<br/>
<%= new Date()//sem o ponto e virgula msm
//usando s� o Date() pq j� importou l� em cima, sen�o teria que colocar o caminho todo java.util.Date()

%>
<br/>
<%//Scriplet - onde vem todo o script
out.print(somarNumeros(3,5));
%>
</body>
</html>