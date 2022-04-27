<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>writeForm.jsp</title>
  <style type="text/css">
  h2{
  text-align:center;
  }
  table{
  margin: auto;
  border: 1px solid black;
  width: 507;
  }
  </style>
  <script type="text/javascript">
  function check(){
	  if(document.myForm.writer.value==''){
		  alert("이름을 입력하세요");
		  document.myForm.writer.focus();
		  return false;
	  }
	  if(document.myForm.subject.value==''){
		  alert("글제목을 입력 하세요");
		  document.myForm.subject.focus();
		  return false;
	  }
	  if(document.myForm.content.value==''){
		  alert("글내용을 입력 하세요");
		  document.myForm.content.focus();
		  return false;
	  }
	  if(document.myForm.pw.value==''){
		  alert("암호를 입력 하세요");
		  document.myForm.pw.focus();
		  return false;
	  }
	  document.myForm.submit(); //서버로 전송
  }//check()-end
  </script>
</head>
<body>
<h2>게시판 글쓰기</h2>
  <table>
    <tr>
      <td align="right">
        <a href="list.jsp?page=1">리스트</a>
      </td>
    </tr>
  </table>
  <form name="myForm" method="post" action="writePro.jsp">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="writer" id="writer" size="30"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" id="subject" size="30"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="content" id="content" rows="10" cols="50"></textarea>
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="30"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <!--<input type="submit" value="글쓰기">-->
          <!-- <input type="reset" value="취소"> -->
          <input type="button" value="글쓰기" onclick="javaScript:check()">
          <input type="button" value="취소" onclick="history.back()">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>