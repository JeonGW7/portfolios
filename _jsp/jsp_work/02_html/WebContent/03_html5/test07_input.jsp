<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//자바구문
request.setCharacterEncoding("UTF-8");//요청시 클라이언트가 보낸 한글 인코딩 처리
%>
이름:<%= request.getParameter("name")%><br>
학번:<%= request.getParameter("student_no")%><br>
성별:<%= request.getParameter("gender")%><br>
과일:
<% 
String fruit[]=request.getParameterValues("fruit");
if(fruit.length>0){
	for(int i=0;i<fruit.length;i++){
		out.println(fruit[i]+"&nbsp;");
	}//for-end
}//if-end
%>
<br>
주소:<%= request.getParameter("addr")%><br>

</body>
</html>