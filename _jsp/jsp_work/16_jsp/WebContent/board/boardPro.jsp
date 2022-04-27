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
String ip=request.getRemoteAddr(); //ip구하고
dto.setIp(ip);

BoardDAO dao=BoardDAO.getDao(); //dao객체 얻기
dao.insertBoard(dto); //dao메서드 호출 
out.println("글쓰기 성공"); 
//3개정도 쓰고 DB가서 확인
%>