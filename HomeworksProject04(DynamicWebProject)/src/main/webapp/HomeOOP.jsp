<%@ page import="com.myigituzun.login.User, com.myigituzun.login.UserManager" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	UserManager manager = new UserManager();
    int userId = (int)session.getAttribute("userId");
	User user = manager.find(userId);
	
	if(user == null){
		response.sendRedirect("Login.jsp");
	}
	
	if ((request.getParameter("logout") != null)) {
		session.removeAttribute("userId");
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
	<h1>Hoşgeldin: <%=user.getUserName() %></h1>
	<form method="POST">
		<input type="submit" value="Logout" name="logout" />
	</form>
</body>
</html>