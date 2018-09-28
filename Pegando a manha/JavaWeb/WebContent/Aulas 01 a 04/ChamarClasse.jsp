<%@page import="utilidades.Data"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
A data atual é:<%= Data.dataAtual() %>
<br/>
A Hora atual é:<%= Data.horaAtual() %>
</body>
</html>