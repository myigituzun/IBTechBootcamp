<%@ page import="com.myigituzun.login.User, com.myigituzun.login.UserManager" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String username = "";
String password = "";
String message = "";
User user = null;

if ((request.getParameter("login") != null)) {
	UserManager manager = new UserManager();
	username = request.getParameter("username");
	password = request.getParameter("password");
	user = manager.findByUserName(username);

	if (user != null && user.getUserName().equals(username) && user.getPassword().equals(password)) {
		session.setAttribute("userId", user.getUserId());
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