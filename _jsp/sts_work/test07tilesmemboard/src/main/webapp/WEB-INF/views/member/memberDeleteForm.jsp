<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/jspheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberDeleteForm.jsp</title>
<script>
function check(){
	if(document.delForm.pw.value==''){
		alert("암호를 입력하세요");
		document.delForm.pw.focus();
		return false;
	}
	if(document.delForm.pw.value != '${memberDto.pw}'){
		alert("암호가 틀립니다");
		document.delForm.pw.value=''; //암호삭제
		document.delForm.pw.focus();
		return false;
	}
	document.delForm.submit();
}
</script>
</head>
<body>
  <h2>회원 탈퇴</h2>
  <form name="delForm" method="post" action="${ctxpath}/member/memberDeletePro.do">
    <table width="50%" align="center">
      <tr>
        <td>암호</td>
        <td>
        <input type="password" name="pw" id="pw" size="20">
        <input type="hidden" name="id" value="${memberDto.id}">
        </td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="탈퇴" onclick="check()">
          <a href="${ctxpath}/member/loginForm.do">취소</a>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>