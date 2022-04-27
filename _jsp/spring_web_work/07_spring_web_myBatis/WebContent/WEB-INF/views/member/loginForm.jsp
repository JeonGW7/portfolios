<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--loginForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <style type="text/css">
  h2{
  text-align: center;
  }
  table{
  margin: auto;
  background-color: orange;
  width: 30%;
  border: 1px solid black;
  }
  </style>
  <script type="text/javascript">
  function check(){
	  ff=eval(document.loginForm);
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
	  
	  ff.submit(); //서버로 전송
  }
  </script>
</head>
<body>
  <h2>로그인</h2>
  ${msg}<br>
  <form name="loginForm" method="post" action="loginPro.do">
    <table>
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
          <input type="button" value="로그인" onClick="check()">
          <input type="reset" value="취소">
        </td>
      </tr>
      
    </table>
  </form>
</body>
</html>