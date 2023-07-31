<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ended</title>
</head>
<body>
	<h1>hello jaairuddin shaikh</h1>
	<h1>url ended</h1>

	<%
	String name1 = (String) request.getAttribute("name1");
	Integer id = (Integer) request.getAttribute("id");
	List<Long> mobileno = (List<Long>) request.getAttribute("mobileno");
	%>

	<h1>
		name is the
		<%=name1%>

	</h1>
	<h1>
		my id is the
		<%=id%>
	</h1>
	<%
	for (Long l : mobileno) {
		out.print(l);
	%>
	<h1><%=l%></h1>
	<%
	}
	%>
</body>
</html>