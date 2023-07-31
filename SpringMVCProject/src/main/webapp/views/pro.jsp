<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello pro plyer</title>
</head>
<body>
	<h1>${name }</h1>
	<h1>hello freinds</h1>
	<h1>${number }</h1>
	<%-- 	<h1>${friend }</h1> --%>

	<c:forEech var="item" items="${friend }">


		<%-- 		<h1>${item }</h1> --%>

		<c:out value="${item} }"></c:out>
	</c:forEech>
</body>
</html>