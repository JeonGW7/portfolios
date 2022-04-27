<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--test04_msg.jsp--%>
<fmt:bundle basename="resource.testBundle">
<html>
<body>
  <fmt:message key="name"/><br>
  <fmt:message key="MSG"/><br>
  <fmt:message key="MSG" var="mm"/> <%--변수에 넣는다 --%>
  <c:out value="${mm}"/>
</body>
</html>
</fmt:bundle>