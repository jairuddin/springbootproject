<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hello jaruddin</h1>
<%String city=(String)request.getAttribute("city");
Long ong=(Long)request.getAttribute("number");
List<String> find=(List<String>)request.getAttribute("fri");
%>

<h1>
my city name
<%=city %></h1>
<h1>my number <%=ong %></h1>

<%for(String ff:find){
	out.print(ff);
} %>
</body>
</html>