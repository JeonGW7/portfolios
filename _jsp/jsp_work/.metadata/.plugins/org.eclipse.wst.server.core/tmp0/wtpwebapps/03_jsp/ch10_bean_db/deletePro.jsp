<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"
    %>
<%--deletePro.jsp--%>
<%
String num=request.getParameter("num");
BoardDAO dao=new BoardDAO(); //객체생성
dao.deleteBoard(Integer.parseInt(num)); //dao메서드 호출
response.sendRedirect("list.jsp");
%>