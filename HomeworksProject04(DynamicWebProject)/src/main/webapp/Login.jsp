<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String username = "";
String password = "";
String message = "";

if ((request.getParameter("login") != null)) {
	username = request.getParameter("username");
	password = request.getParameter("password");

	if (username.equals("myigituzun") && password.equals("java")) {
		session.setAttribute("username", username);
		response.sendRedirect("Home.jsp");
	} else {
		message = "Yanlış!";
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
	<h1><%=message %></h1>
		Kullanıcı adı: <input 
		type="text" name="username" value="<%=username%>" /><br /> <br />
		
		Şifre: <input
			type="password" name="password" value="<%=password%>" /><br /> <br />
			
		<input type="submit" value="Login" name="login" />
	</form>
</body>
</html>