<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"
    %>
<%--editForm.jsp --%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>editForm.jsp</title>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto; width:60%;}
  </style>
</head>
<%
BoardDAO dao=new BoardDAO(); //객체생성
String num=request.getParameter("num");
BoardDTO dto=dao.getUpdate(Integer.parseInt(num)); //dao메서드 호출, dto를 받는다
%>
<body>
  <h2>글수정 폼</h2>
  <form name="myForm" method="post" action="editPro.jsp">
    <table border="1">
      <tr>
        <td>글쓴이</td>
        <td>
          <input type="text" name="writer" id="writer" size="20" value="<%=dto.getWriter() %>">
          <input type="hidden" name="num" value="<%=num %>">
        </td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" id="subject" size="20" value="<%=dto.getSubject()%>"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
        <textarea name="content" id="content" rows="10" cols="50"><%=dto.getContent() %></textarea>
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="20">
        <font color="red">*암호필수입력</font>
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="글수정">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>