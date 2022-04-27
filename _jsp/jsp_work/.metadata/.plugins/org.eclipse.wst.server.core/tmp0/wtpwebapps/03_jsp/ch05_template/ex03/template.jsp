<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--template.jsp--%>
<%
String pagefile=request.getParameter("page");
if(pagefile==null){
	pagefile="newItem.jsp";
}
%>
<html>
  <body>
    <table width="90%" height="90%" align="center" border="1">
      <tr>
        <td colspan="2" align="right" height="10%">
          <jsp:include page="top.jsp" flush="false"/>
        </td>
      </tr>
      <%--왼쪽,가운데--%>
      <tr>
        <td width="10%" align="right" valign="top">
          <br>
          <jsp:include page="left.jsp" flush="false"/>
        </td>
        <td align="center">
          <jsp:include page="<%=pagefile %>" flush="false"/>
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