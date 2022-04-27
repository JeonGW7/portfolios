<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--replyView.jsp--%>
<html>
<head>
<meta charset="UTF-8">
<title>replyView.jsp</title>
<style type="text/css">
h2{
text-align: center;
}
table{
margin: auto;
width: 60%;
}
</style>
<script type="text/javascript">
function check(ff){
	if(ff.bName.value==''){
		alert("이름을 입력 하세요");
		ff.bName.focus();
		return false;
	}
	if(ff.bTitle.value==''){
		alert("제목을 입력 하세요");
		ff.bTitle.focus();
		return false;
	}
	return true;
}
</script>
</head>
<body>
  <h2>답글 쓰기 폼</h2>
  <form method="post" action="replyPro.do" onSubmit="return check(this)">

    <table border="1">
      <tr>
        <td>글번호</td>
        <td>
        ${boardDto.bId}
        <input type="hidden" name="bId" value="${boardDto.bId}">
        <input type="hidden" name="bGroup" value="${boardDto.bGroup}">
        <input type="hidden" name="bStep" value="${boardDto.bStep}">
        <input type="hidden" name="bIndent" value="${boardDto.bIndent}">
        </td>
      </tr>
      
      <tr>
        <td>조회수</td>
        <td>${boardDto.bHit}</td>
      </tr>
      
      <tr>
        <td>이름</td>
        <td><input type="text" name="bName" size="30"></td>
      </tr>
      
      <tr>
        <td>글제목</td>
        <td><input type="text" name="bTitle" value="[답글]" size="50"></td>
      </tr>
      
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="bContent" rows="10" cols="50">[답글]${boardDto.bContent}</textarea>
        </td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="답글쓰기">
          <a href="list.do">글목록보기</a>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>