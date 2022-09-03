<%@ page import="com.myigituzun.rectangle.Rectangle" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%
int area = 0;
int perimeter = 0;
int width = 0;
int height = 0;

if (request.getParameter("calc") != null) {
	Rectangle rectangle = new Rectangle();
	width = Integer.parseInt(request.getParameter("width"));
	height = Integer.parseInt(request.getParameter("height"));
	rectangle.setWidth(width);
	rectangle.setHeight(height);
	area = rectangle.getArea();
	perimeter = rectangle.getPerimeter();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Alan:
	<%=area%><br />
	Çevre:
	<%=perimeter%><br /><br />
	<form method="POST"> 
		Genişlik: <input type="text" name="width" value="<%=width%>" /><br /> <br />
		Yükseklik: <input type="text" name="height" value="<%=height%>" /><br /> <br />
		<input type="submit" value="Hesapla" name="calc" />
	</form>
</body>
</html>