<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<tilesx:useAttribute id="cssList" name="cssList" classname="java.util.List"/>
<tilesx:useAttribute id="jsList" name="jsList" classname="java.util.List"/>
<tiles:importAttribute name="jsList"/>
<c:forEach var="file" items="${cssList}">
	<link rel="stylesheet" href="<c:out value='file'></c:out>" />
</c:forEach>
<c:forEach var="file" items="${jsList}">
	<script src="<c:out value='file'></c:out>"></script>
</c:forEach>
</head>
<body>
	<div class="container">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
	
</body>
</html>