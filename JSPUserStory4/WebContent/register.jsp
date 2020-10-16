<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Project Details</h1>
<form action="<%=request.getContextPath()%>/ControllerServlet"  method="post">

<tr>
<td>ID</td>
<td><input type="text" name="id" /></td>
</tr>

<tr>
<td>Title</td>
<td><input type="text" name="title" /></td>
</tr>
<tr>
<tr>
<td>Description</td>
<td><input type="text"  name="descrp"/></td>
</tr>

<tr>
<td>Domain</td>
<td><input  type="text"  name="domain"/></td>
</tr>
<input  type="submit" value="Submit"/>


</form>
</div>
</body>
</html>