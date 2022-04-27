<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/header/header.jsp" %>

<%--template.jsp 동적배치--%>
<html>
  <body>
    <table width="90%" height="90%" border="1">
      <tr>
        <td colspan="2" align="right">
          <jsp:include page="/module/top.jsp" flush="false"/>
        </td>
      </tr>
      <tr>
        <td align="left">
          <a href="${ctxpath}/template/template.jsp"><img src="../imgs/home.gif"></a>
        </td>
        <td align="right">
          <%@ include file="/member/main.jsp" %>
        </td>
      </tr>
      <tr>
        <td width="100" valign="top"><%--왼쪽메뉴--%>
          <jsp:include page="/module/left.jsp" flush="false"/>
        </td>
        
        <td width="700" height="90%" valign="top"><%--중앙에표시--%>
          <jsp:include page="${CONTENT}" flush="false"/>
        </td>
      </tr>
      
      <tr>
        <td width="700" align="center" valign="top" colspan="2">
          <jsp:include page="/module/bottom.jsp" flush="false"/>
        </td>
      </tr>
    </table>
  </body>
</html>