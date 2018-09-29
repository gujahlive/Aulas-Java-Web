<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultado</title>
</head>
<body>
<%
String svalorA = request.getParameter("valorA");
String svalorB = request.getParameter("valorB");
String sopcao = request.getParameter("opcao");


double dvalorA = Double.parseDouble(svalorA);
double dvalorB = Double.parseDouble(svalorB);
double result = 0;

if(sopcao.equals("+")) {
	result = dvalorA + dvalorB;
}
if(sopcao.equals("-")) {
	result = dvalorA - dvalorB;
}
if(sopcao.equals("*")) {
	result = dvalorA * dvalorB;
}
if(sopcao.equals("/")) {
	result = dvalorA / dvalorB;
}
out.print("Resutado<br/>"+result);
%>
<a href="calcJSP.html">Voltar</a>
</body>
</html>