<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test03_post.jsp</title>
</head>
<body>
  <h2>post방식 요청</h2>
  <form method="post" action="test03.jsp">
    ID: <input type="text" name="id" id="id" size="20"><br>
        이름: <input type="text" name="name" id="name" size="20"><br>
     <input type="submit" value="전송">
  </form>
</body>
</html>