<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--template.jsp--%>

<%
String control=request.getParameter("control");
String contentPage=request.getParameter("contentPage");
String pageTitle=request.getParameter("pageTitle");

String left_jsp=control+"left.jsp";
%>
<html>
  <body>
  	<center>
    <h2>MyHome:<%=pageTitle %></h2>
    </center>
    <table width="90%" height="90%" align="center" border="1">
      <tr>
        <td colspan="2" height="10%" align="right">
          <jsp:include page="top.jsp" flush="false"/>
        </td>
      </tr>
      <%--왼쪽,중앙표시 --%>
      <tr>
        <td width="10%" valign="top">
          <jsp:include page="<%=left_jsp%>" flush="false"/>
        </td>
        <td width="80%" height="80%" valign="top">
          <jsp:include page="<%=contentPage %>" flush="false"/>
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center" height="10%">
          <jsp:include page="bottom.jsp" flush="false"/>
        </td>
      </tr>
    </table>
  </body>
</html>