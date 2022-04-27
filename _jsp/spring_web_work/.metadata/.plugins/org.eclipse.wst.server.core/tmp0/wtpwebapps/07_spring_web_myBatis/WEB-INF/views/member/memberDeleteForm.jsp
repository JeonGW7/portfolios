<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--memberDeleteForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <script type="text/javascript">
    function delCheck(){
    	if(document.deleteForm.pw.value==''){
    		alert("암호를 입력하세요");
    		document.deleteForm.pw.focus();
    		return false;
    	}
    	if(document.deleteForm.pw.value!='${memberDto.pw}'){
    		alert("암호가 틀립니다");
    		document.deleteForm.pw.focus();
    		return false;
    	}
    	document.deleteForm.submit();
    }
  </script>
</head>
<body>
  <h2>회원탈퇴</h2>
  <form name="deleteForm" method="post" action="memberDeletePro.do">
    <table>
      <tr>
        <td>암호</td>
        <td>
          <input type="password" name="pw" id="pw" size="20">
          <input type="hidden" name="id" value="${memberDto.id}">
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="회원탈퇴" onClick="delCheck()">
          <input type="button" value="취소" onClick="location='list.do'">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>