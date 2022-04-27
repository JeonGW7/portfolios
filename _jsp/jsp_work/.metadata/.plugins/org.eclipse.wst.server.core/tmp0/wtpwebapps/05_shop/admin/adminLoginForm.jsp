<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--adminLoginForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>adminloginForm.jsp</title>
  <link href="style.css" rel="stylesheet" type="text/css">
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript" src="script.js"></script>
  <script>
    function adminCheck(){
    	if($('#adminId').val()==''){
    		alert("adminId를 입력 하세요");
    		$('#adminId').focus();
    		return false;
    	}
    	if($('#adminPw').val()==''){
    		alert("adminPw를 입력 하세요");
    		$('#adminPw').focus();
    		return false;
    	}
    	//return true;
    	document.myForm.submit(); //서버로 전송
    }
  </script>
</head>
<body topmargin="20">
<%=request.getRealPath("/")%><br>
<%=config.getServletContext().getRealPath("/")%><br>
<br>
  <form name="myForm" method="post" action="adminLoginPro.jsp">
    <table width="50%" border="1">
      <tr>
        <td>AdminID</td>
        <td><input type="text" name="adminId" id="adminId" size="20"></td>
      </tr>
      
      <tr>
        <td>AdminPW</td>
        <td><input type="password" name="adminPw" id="adminPw" size="20"></td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="Admin로그인" onClick="adminCheck()">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>