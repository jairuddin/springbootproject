<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page "isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String name=(String)request.getAttribute("name1");
	Integer number=(Integer)request.getAttribute("number1");
%>
<h1><%=name %></h1>

<h1><%=number %>h1>
<%-- <h1> my name is ${name1 }</h1> --%>
<%-- <h1>my number ${number1 }</h1> --%>

</body>
</html>