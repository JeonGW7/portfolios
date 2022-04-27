<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="board.*"
    %>
<%--boardPro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="dto" class="board.BoardDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>
<%
BoardDAO dao=BoardDAO.getDao(); //dao객체 얻기
dao.insertBoard(dto); //dao메서드 호출 
out.println("글쓰기 성공"); 
%>