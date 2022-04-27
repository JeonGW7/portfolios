<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>06_pageContext.jsp</title>
</head>
<body>
<%
JspWriter out2=pageContext.getOut(); //out객체 얻기
out2.println("2022년 02월07일 월요일");
%>
<ol>
  <li>요청객체 얻는방법: <%=pageContext.getRequest() %>
  <li>세션객체 얻는방법: <%=pageContext.getSession() %>
  <li>예외객체 얻는방법: <%=pageContext.getException() %>
</ol>
<%
//web.xml의 초기 파라미터 값 얻기
String name=pageContext.getServletContext().getInitParameter("name");
String id=pageContext.getServletContext().getInitParameter("id");
%>
이름:<%=name %><br>
ID:<%=id %><br>
</body>
</html>