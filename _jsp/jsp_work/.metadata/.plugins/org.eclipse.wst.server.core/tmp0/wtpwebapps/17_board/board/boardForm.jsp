<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--boardForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>boardForm.jsp</title>
  <style type="text/css">
    h2{text-align:center;}
    table{
    margin:auto;
    }
  </style>
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
  function check(){
	  if($('#name').val()==''){
		  alert("이름을 입력 하세요");
		  $('#name').focus();
		  return false;
	  }
	  if($('#title').val()==''){
		  alert("글제목을 입력 하세요");
		  $('#title').focus();
		  return false;
	  }
	  if($('#content').val()==''){
		  alert("글내용을 입력 하세요");
		  $('#content').focus();
		  return false;
	  }
	 
	  return true;
  }//check-end
  </script>
</head>
<body>
  <h2>게시판 글쓰기</h2>
  <form name="myForm" method="post" action="boardPro.jsp" onSubmit="return check()">
    <table border="1">
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" id="name" size="30" placeholder="이름입력"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="title" id="title" size="50" placeholder="글제목입력"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="content" id="content" rows="10" cols="50" placeholder="글내용입력"></textarea>
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="글쓰기">
          <input type="reset" value="다시쓰기">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>