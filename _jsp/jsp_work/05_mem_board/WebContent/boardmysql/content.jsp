<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardmysql.*"
    %>
<%--content.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>content.jsp</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<%
//list.jsp가 보내준 데이터 받기
int num=Integer.parseInt(request.getParameter("num"));
String pageNum=request.getParameter("pageNum");
BoardDAO dao=BoardDAO.getDao(); //dao객체 얻기
BoardDTO dto=dao.getBoard(num); //dao메서드 호출,dto를 받는다
int ref=dto.getRef(); 
int re_step=dto.getRe_step();
int re_level=dto.getRe_level();
%>
<body>
  <h2>글내용 보기</h2>
  <table border="1">
    <tr>
      <td>글번호</td>
      <td><%=dto.getNum()%></td>
      
      <td>조회수</td>
      <td><%=dto.getReadcount()%></td>
    </tr>
    <tr>
      <td>작성자</td>
      <td><%=dto.getWriter()%></td>
      
      <td>작성일</td>
      <td><%=dto.getRegdate()%></td>
    </tr>
    <tr>
      <td>글제목</td>
      <td colspan="3">
        <%=dto.getSubject()%>
      </td>
    </tr>
    <tr>
      <td colspan="4">
        <%
        String content=dto.getContent();
        content=content.replace("\n", "<br>");
        %>
        <%=content%>
      </td>
    </tr>
    <tr>
      <td colspan="4" align="right">
        <input type="button" value="글수정" onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>&pageNum=<%=pageNum%>'">
        <input type="button" value="글삭제" onclick="location.href='deleteForm.jsp?num=<%=dto.getNum()%>&pageNum=<%=pageNum%>'">
        <input type="button" value="답글쓰기" onclick="location.href='writeForm.jsp?num=<%=dto.getNum()%>&pageNum=<%=pageNum%>&ref=<%=ref%>&re_step=<%=re_step%>&re_level=<%=re_level%>'">
        <input type="button" value="리스트" onclick="location.href='list.jsp?pageNum=<%=pageNum%>'">
      </td>
    </tr>
  </table>
</body>
</html>