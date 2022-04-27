<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>layout.jsp</title>
</head>
<body>
  <table border="1" style="width:100%;min-width:70%;">
    <tr>
      <td colspan="2" height="60" bgcolor="ivory">
        <tiles:insertAttribute name="header"/>
      </td>
    </tr>
    
    <tr>
      <td valign="top">
        <tiles:insertAttribute name="content"/>
      </td>
    </tr>
    
    <tr>
      <td colspan="2" height="100">
        <tiles:insertAttribute name="footer"/>
      </td>
    </tr>
  </table>
</body>
</html>