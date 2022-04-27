<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--writeForm.jsp--%>
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
<script type="text/javascript">
function check(ff){
	if(ff.bName.value==''){
		alert("이름을 입력하세요");
		ff.bName.focus();
		return false;
	}
	if(ff.bTitle.value==''){
		alert("제목을 입력하세요");
		ff.bTitle.focus();
		return false;
	}
	if(ff.bContent.value==''){
		alert("글내용을 입력하세요");
		ff.bContent.focus();
		return false;
	}
	return true;
}
</script>
</head>
<body>
  <h2>게시판 글쓰기</h2>
  <form name="writeForm" method="post" action="writePro.do" onsubmit="return check(this)">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="bName" id="bName" size="30"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="bTitle" id="bTitle" size="50"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="bContent" id="bContent" rows="10" cols="50"></textarea>
        </td>
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