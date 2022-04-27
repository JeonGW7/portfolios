<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sessionTest.jsp</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8"); //post요청시 한글 인코딩 처리

//클라이언트가 보내준 데이터 받기 
String id=request.getParameter("id");
String pw=request.getParameter("pw");

session.setAttribute("id", id); //설정
//session.setAttribute("이름", value);
%>
<form method="post" action="sessionTest2.jsp">
 1. 가장 좋아 하는 계절은 ? <br>
 <input type="radio" name="season" value="봄">봄<br>
 <input type="radio" name="season" value="여름">여름<br>
 <input type="radio" name="season" value="가을">가을<br>
 <input type="radio" name="season" value="겨울">겨울<br>
 <p>
 2. 가장 좋아 하는 과일은? <br>
 <input type="radio" name="fruit" value="수박">수박<br>
 <input type="radio" name="fruit" value="딸기">딸기<br>
 <input type="radio" name="fruit" value="바나나">바나나<br>
 <input type="radio" name="fruit" value="멜론">멜론<br>
 <input type="radio" name="fruit" value="오렌지">오렌지<br>
 <br>
 <input type="submit" value="전송">
 <input type="reset" value="취소">
</form>
</body>
</html>