<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<h1>hello jairuddin</h1>
	<h2>called by home controller</h2>
	<h2>url /home</h2>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	



	%>
	
	<h1>
		name is the
		<%=name%>

	</h1>
	<h1>
		id is the
		<%=id%>
	</h1>
	
	




</body>
</html>
