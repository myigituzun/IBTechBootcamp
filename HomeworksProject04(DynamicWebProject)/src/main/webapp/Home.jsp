<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
    String username = (String)session.getAttribute("username");
	
	if(username == null){
		response.sendRedirect("Login.jsp");
	}
	
	if ((request.getParameter("logout") != null)) {
		session.removeAttribute("username");
		response.sendRedirect("Login.jsp");
	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hoşgeldin: <%=username %></h1>
	<form method="POST">
		<input type="submit" value="Logout" name="logout" />
	</form>
</body>
</html>