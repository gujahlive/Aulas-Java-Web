<%
	session.invalidate();//invalida a sess�o que foi aberta
    response.sendRedirect("login.jsp");


%>