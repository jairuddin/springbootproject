<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help method</title>
</head>
<body>
<h1>
		my name is
		${name }
<%-- 		<%=name %> --%>
	</h1>
<%

		/* String name = (String) request.getAttribute("name"); */
		Long mobileno = (Long) request.getAttribute("mobileno");
		List<String> freinds=(List<String>)request.getAttribute("list");
		%>
		
		<h1>my mobileno
	<%=mobileno %>
	</h1>
	
	<h1>
	<%for(String f:freinds){
		out.print(f);
	} %>
	</h1>
	

	
</body>
</html>