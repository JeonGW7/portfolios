<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test03_get.jsp</title>
</head>
<%--
test03_get.jsp  클라이언트 get방식 요청
test03_post.jsp  클라이언드 post방식 요청
test03.jsp 서버 
 --%>
<body>
  <h2>get방식 요청</h2>
  <form method="get" action="test03.jsp">
    ID: <input type="text" name="id" id="id" size="20"><br>
        이름: <input type="text" name="name" id="name" size="20"><br>
     <input type="submit" value="전송">
  </form>
</body>
</html>