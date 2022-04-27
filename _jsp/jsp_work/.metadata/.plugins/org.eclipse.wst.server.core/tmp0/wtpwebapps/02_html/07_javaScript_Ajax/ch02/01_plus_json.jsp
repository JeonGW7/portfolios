<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--01_plus_json.jsp--%>
<%
int p1=Integer.parseInt(request.getParameter("p1"));
int p2=Integer.parseInt(request.getParameter("p2"));
int re=p1+p2;
%>
<%--JSON데이터--%>
{
"re":<%=re%>
}
