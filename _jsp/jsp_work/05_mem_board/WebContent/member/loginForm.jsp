<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--loginForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>loginForm.jsp</title>
  <script type="text/javascript">
  function check(){
	  ff=eval("document.myForm");
	  if(ff.id.value==''){
		  alert("ID를 입력하세요");
		  ff.id.focus();
		  return false;
	  }
	  if(ff.pw.value==''){
		  alert("암호를 입력하세요");
		  ff.pw.focus();
		  return false;
	  }
	  
	  return true;
  }
  </script>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto;}
  </style>
</head>
<body>
  <form name="myForm" method="post" action="loginPro.jsp" onSubmit="return check()">
    <table border="1">
      <tr>
        <td>ID</td>
        <td><input type="text" name="id" id="id" size="20"></td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="20"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="로그인">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>