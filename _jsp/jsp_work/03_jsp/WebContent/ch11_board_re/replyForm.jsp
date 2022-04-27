<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    %>
<%--replyForm.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
//content.jsp가 보내준 데이터 받기
int nowPage=Integer.parseInt(request.getParameter("page"));
int num=Integer.parseInt(request.getParameter("num"));
BoardDAO dao=new BoardDAO(); //객체생성
BoardDTO dto=dao.getBoard(num); //메서드
String subject=dto.getSubject();
String content=dto.getContent();
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>replyForm.jsp</title>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto; width: 60%;}
  </style>
</head>
<body>
  <h2>답글쓰기</h2>
  <form name="reForm" method="post" action="replyPro.jsp">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" size="20"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" size="50" value="답글:<%=subject%>"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="content" rows="10" cols="50"><%=content+"\n" %></textarea>
        </td>
      </tr>
       <tr>
        <td>암호</td>
        <td><input type="password" name="pw" size="20"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="답글등록">
          <input type="reset" value="다시쓰기">
          <input type="button" value="뒤로" onclick="history.back()">
          <input type="hidden" name="ip" value="<%=request.getRemoteAddr()%>">
          <input type="hidden" name="page" value="<%=nowPage%>">
          <input type="hidden" name="num" value="<%=num%>">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>