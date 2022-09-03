<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
    int left = Integer.parseInt(request.getParameter("left"));
    int right = Integer.parseInt(request.getParameter("right"));
    int sum = left+right;
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	Toplam:
	<%=sum %>
</body>
</html>