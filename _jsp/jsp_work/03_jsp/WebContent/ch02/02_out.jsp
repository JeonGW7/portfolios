<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="10kb" %>
<html>
	<head>
  		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  		<title>02_out.jsp</title>
	</head>
<body>
  <h2>out내장 객체</h2>
  <%
  int total=out.getBufferSize(); //전체 버퍼 구하기, 디폴트 8kb (1kb=1024)
  int rate=out.getRemaining(); //남아있는 출력 버퍼 size를 구한다
  %>
  전체 버퍼 : <%=total%><br>
  남아있는 버퍼: <%=rate%><br>
  사용중인 버퍼: <%=total-rate%><br>
</body>
</html>