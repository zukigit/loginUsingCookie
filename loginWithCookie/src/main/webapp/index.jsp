<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	String name = "";
	boolean signedIn = false ;
	for(Cookie c : cookies){
		if (c.getName().equals("c-name")){
			if(c.getValue() != "") {
				name = c.getValue();
				signedIn = true ;
			}
		}
	}
	if (signedIn){
		out.print("hola " + name);
	}else {
		response.sendRedirect("login.html");
	}
%>
<br>
<form action = "delete">
<input type = "submit" value = "logout">
</form>
</body>
</html>