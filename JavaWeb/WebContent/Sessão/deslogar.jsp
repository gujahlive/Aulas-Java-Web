<%
	session.invalidate();//invalida a sessão que foi aberta
    response.sendRedirect("login.jsp");


%>