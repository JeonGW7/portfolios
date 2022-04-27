<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test01_lifeCycle.jsp</title>
</head>
<body>
<%!
String msg="Hello"; //전역변수 선언
//jspInit()오버라이딩, 생성자와 같은 기능을 한다(=초기화 작업)
public void jspInit(){
	msg+=" jspInit() called ";
	System.out.println(msg);
}
//jspDestroy()오버라이딩
public void jspDestroy(){
	System.out.println("jspDestroy() called");
}
%>
<%
msg+=" _jspService()실행<br>"; //자바구문
%>
<%= msg%><br>
</body>
</html>
<%--
1. jspInit() : JSP페이지 초기화 될 때 한번 호출된다 
2. jspDestroy() : JSP페이지가 메모리에서 제거 되기 직전에 호출된다(DB끊기)
3. 생명주기
   jspInit() -> _jspService() -> jspDestroy()
   				  doGet()
   				  doPost()
4. _jspService() : 클라이언트 요청을 처리하는 메소드로써 
  				   JSP컨테이너에 의해서 자동으로 생성되어진다 
--%>