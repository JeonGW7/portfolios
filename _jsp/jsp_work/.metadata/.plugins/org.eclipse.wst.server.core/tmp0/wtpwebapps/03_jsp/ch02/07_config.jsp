<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>07_config.jsp</title>
</head>
<body>
  <h2>config객체 사용</h2>
  <ol>
    <li>서블릿 이름:<%=config.getServletName() %>
    <li>서블릿 Context:<%=config.getServletContext() %>
    <%--web.xml에 설정된 초기 파라미터 --%>
    <li>이름:<%=config.getServletContext().getInitParameter("name") %>
    <li>ID:<%=config.getServletContext().getInitParameter("id") %>
  </ol>
</body>
</html>