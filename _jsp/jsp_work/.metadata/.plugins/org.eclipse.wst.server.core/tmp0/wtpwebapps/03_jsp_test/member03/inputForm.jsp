<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>inputForm.jsp</title>
  <style type="text/css">
  h2{
    text-align: center;
    }
    table{
    margin: auto;
    border: 1px solid black;
    }

  </style>
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript">
  function check(){
	  if($('#id').val()==''){
		  alert("ID를 입력하세요");
		  $('#id').focus();
		  return false;
	  }
	  if($('#pw').val()==''){
		  alert("암호를 입력하세요");
		  $('#pw').focus();
		  return false;
	  }
	  if($('#name').val()==''){
		  alert("이름을 입력하세요");
		  $('#name').focus();
		  return false;
	  }
	  document.myForm.submit(); //서버로 전송
  }
  </script>
</head>
<body>
<h2>회원가입</h2>
<form name="myForm" method="post" action="inputPro.jsp">
  <table border="1">
    <tr>
      <td>ID</td>
      <td><input type="text" name="id" id="id" size="20" placeholder="ID입력"></td>
    </tr>
    <tr>
      <td>암호</td>
      <td><input type="password" name="pw" id="pw" size="20" placeholder="암호입력"></td>
    </tr>
    <tr>
      <td>이름</td>
      <td><input type="text" name="name" id="name" size="20" placeholder="이름입력"></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="button" value="회원가입" onclick="javaScript:check()">
        <input type="reset" value="취소">
      </td>
    </tr>
  </table>
</form>
</body>
</html>