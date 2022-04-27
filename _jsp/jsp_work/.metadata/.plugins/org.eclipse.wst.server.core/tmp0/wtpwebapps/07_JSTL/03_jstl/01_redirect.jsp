<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--01_redirect.jsp--%>
<%--
1.redirect 태그 형식 : response.sendRedirect("url")과 같은 기능
<c:redirect url="">
  <c:param name="id" value="kim"/>
</c:redirect>
--%>
<%--실습--%>
<%
//response.sendRedirect("list.jsp?name=kim");
%>
<c:redirect url="../01_jstl/03_if_tag.jsp">
  <c:param name="name" value="park"/>
  <c:param name="age" value="21"/>
</c:redirect>