<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"
    %>
<%--content.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>content.jsp</title>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto; width:60%;}
  </style>
</head>
<%
String num=request.getParameter("num"); //list.jsp에서 보낸것 받기 
BoardDAO dao=new BoardDAO(); //객체생성
BoardDTO dto=dao.getBoard(Integer.parseInt(num)); //dao메서드 호출
%>
<body>
  <h2>글내용보기</h2>
  <table>
    <tr>
      <td align="right">
        <a href="writeForm.jsp">글쓰기</a>&nbsp;
        <a href="editForm.jsp?num=<%=num%>">글수정</a>&nbsp;
        <a href="deletePro.jsp?num=<%=num%>">글삭제</a>&nbsp;
        <a href="list.jsp">리스트</a>&nbsp;
      </td>
    </tr>
  </table>
  
  <table border="1">
    <tr>
	  <td>글쓴이</td>
	  <td><%=dto.getWriter() %></td>
    </tr>
    <tr>
	  <td>날짜</td>
	  <td><%=dto.getWdate() %></td>
	</tr>
	<tr>
	  <td>조회수</td>
	  <td><%=dto.getReadcount() %></td>
	</tr>
	<tr>
	  <td>ip</td>
	  <td><%=dto.getIp() %></td>
	</tr>
	<tr>
	  <td>글제목</td>
	  <td><%=dto.getSubject() %></td>
	</tr>
	<tr>
	  <td>글내용</td>
	  <td><pre><%=dto.getContent() %></pre></td>
	</tr>
	
  </table>
</body>
</html>