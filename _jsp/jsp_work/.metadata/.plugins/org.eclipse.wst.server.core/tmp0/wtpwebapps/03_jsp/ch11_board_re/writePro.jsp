<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    %>
<%--writePro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dto" class="boardre.BoardDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

<%
String ip=request.getRemoteAddr();
dto.setIp(ip);
BoardDAO dao=new BoardDAO(); //객체생성
dao.insertBoard(dto); //dao메서드 호출

response.sendRedirect("list.jsp");
%>