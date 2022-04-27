<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--editForm.jsp--%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h2 {
	text-align: center;
}

table {
	margin: auto;
	border: 1px solid black;
	width: 60%;
}
</style>
<script>
function check(){
	if(document.editForm.pw.value==""){
		alert("암호는 필수 입력 입니다");
		return false;
	}
	if(document.editForm.pw.value != '${boardDto.pw}'){
		alert("암호가 틀립니다");
		return false;
	}
	document.editForm.submit();
}
</script>
</head>
<body>
  <h2>게시판 수정</h2>
  <form name="editForm" method="post" action="editPro.do">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="writer" id="writer" size="30" value="${boardDto.writer}"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td>
        <input type="text" name="subject" id="subject" size="50" value="${boardDto.subject}">
        <input type="hidden" name="num" value="${boardDto.num}">
        </td>
        
      </tr>
      <tr>
        <td>글내용</td>
        <td>
        <textarea name="content" id="content" rows="10" cols="50">${boardDto.content}</textarea>
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td>
          <input type="password" name="pw" id="pw" size="20">*필수입력
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="글수정" onClick="check()">
          <input type="reset" value="취소">
          <a href="list.do">리스트로 가기</a>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>