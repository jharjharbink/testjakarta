<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <%@include file="/WEB-INF/linkBootstrap.html"%>

</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="plainTexte">Hello text</a>
<a href="html">Hello html</a>
<a href="jsp">Hello JSP</a>

<hr>

<a href="jspBootstrap1">Hello JSP Bootstrape 1</a>
<a href="jspBootstrap2">Hello JSP Bootstrape 2</a>

</body>
</html>