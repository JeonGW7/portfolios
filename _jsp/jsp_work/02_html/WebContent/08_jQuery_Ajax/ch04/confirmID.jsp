<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<%--confirmID.jsp--%>
<%
String id=request.getParameter("id");
//DAO에서 id가 사용중인지를 체크, x를 넘겨받아서 존재여부 판별
int x=1;//존재하는 id일때 1
//int x=-1;//사용 가능한 id일때 -1
%>
{
"x":<%=x%>
}