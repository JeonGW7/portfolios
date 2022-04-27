<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardmysql.*"
    %>
<%--writePro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dto" class="boardmysql.BoardDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

<%
String ip=request.getRemoteAddr(); //ip

BoardDAO dao=BoardDAO.getDao(); //dao객체 얻기
dto.setIp(ip);
dao.insertBoard(dto); //dao메서드 호출, dto를 넘긴다, insert
response.sendRedirect("list.jsp");
%>