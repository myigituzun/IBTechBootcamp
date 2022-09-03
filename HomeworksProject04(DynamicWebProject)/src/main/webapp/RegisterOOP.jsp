<%@ page import="com.myigituzun.login.User, com.myigituzun.login.UserManager" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String username = "";
String password = "";
String message = "";

if ((request.getParameter("signin") != null)) {
	UserManager manager = new UserManager();
	User user = new User();
	username = request.getParameter("username");
	password = request.getParameter("password");
	user.setPassword(password);
	user.setUserName(username);
	

	if (!username.equals("") && !password.equals("")) {
		if(manager.create(user)){
			response.sendRedirect("Login.jsp");
		}
	} else {
		message = "Eksik bilgi!";
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
			
		<input type="submit" value="Sing In" name="signin" />
	</form>
</body>
</html>