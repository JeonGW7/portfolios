<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--template.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
String contentPage=request.getParameter("contentPage"); //main.jsp에서 보내준 것 받기
%>
<html>
  <body>
    <table border="1" width="90%" height="90%" align="center">
	  <tr>
	    <td colspan="2" align="right" height="10%">
	      <jsp:include page="top.jsp" flush="false"/>
	      <%--flush="false" 출력 버퍼를 지우지 않도록 한다 --%>
	    </td>
	  </tr>
	  <%--왼쪽 메뉴,content --%>
	  <tr>
	    <td width="10%" valign="top" bgcolor="pink">
	      <jsp:include page="left.jsp" flush="false"/>
	    </td>
	    <td width="90%" valign="top" align="center" bgcolor="ivory">
	      <jsp:include page="<%=contentPage %>" flush="false"/>
	    </td>
	  </tr>
	  <tr>
	    <td colspan="2" height="10%" bgcolor="lightgray">
	      <jsp:include page="bottom.jsp" flush="false"/>
	    </td>
	  </tr>
    </table>
  </body>
</html>