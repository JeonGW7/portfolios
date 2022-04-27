<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test04_gugudan.jsp,동국대 대학원 리포트</title>
</head>
<body>
<table border="1">

<%
for(int i=1;i<=9;i++){
%>
<tr>
<% 	
	for(int j=2;j<=9;j++){
%>
		<td><%= j+"x"+i+"="+j*i %></td>
<% 	
	}	
}
%>
</tr>
</table>
</body>
</html>