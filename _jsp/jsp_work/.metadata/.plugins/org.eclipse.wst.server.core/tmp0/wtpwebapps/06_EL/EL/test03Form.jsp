<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--test03Form.jsp
param		:request.getParameter()와 같은 기능
--%>
<%
session.setAttribute("id", "admin");
%>
<html>
<body>
  <form name="myForm" method="post" action="test03Pro.jsp">
    <table border="1">
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" id="name" size="20"></td>
      </tr>
      <tr>
        <td>전화</td>
        <td><input type="text" name="tel" id="tel" size="20"></td>
      </tr>
      <tr>
        <td>주소</td>
        <td><input type="text" name="addr" id="addr" size="20"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="전송">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>