<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"
    %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TestBean.jsp</title>
</head>
<body>
  <jsp:useBean id="dto" class="mypa.TestDTO">
    <jsp:setProperty name="dto" property="id" value="hong"/>
    <jsp:setProperty name="dto" property="pw" value="h123"/>
    <jsp:setProperty name="dto" property="name" value="홍길동"/>
    ID:<jsp:getProperty name="dto" property="id"/><br>
         암호:<jsp:getProperty name="dto" property="pw"/><br>
         이름:<jsp:getProperty name="dto" property="name"/><br>
  </jsp:useBean>
  <%--<jsp:useBean~~> 객체생성 --%>
  <%
  dto.setId("park");
  dto.setPw("p123");
  dto.setName("박지성");
  %>
  ID:<%=dto.getId() %><br>
    암호:<%=dto.getPw() %><br>
    이름:<%=dto.getName() %><br>
</body>
</html>