<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sessionTest2.jsp</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
//보내준 데이터 받기
String season=request.getParameter("season");
String fruit=request.getParameter("fruit");
String id=(String)session.getAttribute("id"); //id에 해당하는 값을 얻는다 
String sessionID=session.getId(); //session ID는 자동으로 부여된다 

if(id != null){//로그인 상태이면
%>
<b><%=id %></b>님이 좋아 하는 계절과 과일은<br>
<b><%=season %></b>과 <b><%=fruit %></b>입니다
<br>
sessionID:<%=sessionID %><br>
<% 	
}else{//로그인 상태가 아니면
	out.println("세션 시간이 경과 하였거나 다른 이유로 연결할 수 없습니다, 로그인 하세요");
}
%>
</body>
</html>