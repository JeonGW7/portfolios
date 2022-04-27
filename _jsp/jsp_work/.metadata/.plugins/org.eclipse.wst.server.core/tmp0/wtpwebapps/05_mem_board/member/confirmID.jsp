<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="member.*"
    %>
<%--confirmID.jsp--%>
<%
String id=request.getParameter("id");
MemberDAO dao=MemberDAO.getDao(); //dao객체얻기
int x=dao.confirmID(id); //dao메서드 호출 x값을 받는다
%>
{
"x":<%=x%>
}