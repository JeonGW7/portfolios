<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mail.*"
    import="com.oreilly.servlet.*"
    %>
<%--mailSend.jsp--%>
<jsp:useBean id="mailBean" class="mail.MailSender">
  <jsp:setProperty name="mailBean" property="*"/>
</jsp:useBean>
<%=mailBean.send()%>