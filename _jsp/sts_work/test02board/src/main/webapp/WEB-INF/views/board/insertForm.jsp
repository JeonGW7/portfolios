<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--insertForm.jsp--%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style type="text/css">
  h2{
  text-align: center;
  }
  table{
  margin: auto;
  border: 1px solid black;
  width: 60%;
  }
  </style>
  <script>
    function check(ff){
    	if(ff.writer.value==''){
    		alert("이름을 입력 하세요");
    		ff.writer.focus();
    		return false;
    	}
    	if(ff.subject.value==''){
    		alert("글제목을 입력 하세요");
    		ff.subject.focus();
    		return false;
    	}
    	if(ff.content.value==''){
    		alert("글내용을 입력 하세요");
    		ff.content.focus();
    		return false;
    	}
    	if(ff.pw.value==''){
    		alert("암호를 입력 하세요");
    		ff.pw.focus();
    		return false;
    	}
    	return true;
    }
  </script>
</head>
<body>
  <h2>게시판 글쓰기</h2>
  <form name="myForm" method="post" action="insertPro.do" onsubmit="return check(this)">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="writer" id="writer" size="30"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" id="subject" size="45"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="content" id="content" rows="10" cols="50"></textarea>
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="20"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="글쓰기">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>