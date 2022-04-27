<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/header.jsp" %>

<%--writeForm.jsp--%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
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
	if(ff.writer.value==''){
		alert("이름을 입력하세요");
		ff.writer.focus();
		return false;
	}
	if(ff.subject.value==''){
		alert("제목을 입력하세요");
		ff.bTitle.focus();
		return false;
	}
	if(ff.content.value==''){
		alert("글내용을 입력하세요");
		ff.content.focus();
		return false;
	}
	return true;
}
</script>
</head>
<body>

  <h2>
  <c:if test="${num==0}">
         글쓰기 
  </c:if>   
  <c:if test="${num!=0}">
         답글쓰기
  </c:if>
  
  </h2>
  <table>
  <tr>
      <td colspan="2" align="right">
        <a href="${ctxpath}/board/list.do">리스트</a>
      </td>
    </tr>
  </table>
  <form name="writeForm" method="post" action="${ctxpath}/board/writePro.do" onSubmit="return check(this)">
    <input type="hidden" name="pageNum" value="${pageNum}">
    <input type="hidden" name="num" value="${num}">
    <input type="hidden" name="ref" value="${ref}">
    <input type="hidden" name="re_step" value="${re_step}">
    <input type="hidden" name="re_level" value="${re_level}">
  <table border="1">
    
    <tr>
      <td>이름</td>
      <td><input type="text" name="writer" id="writer" size="20"></td>
    </tr>
    <tr>
      <td>글제목</td>
      <td>
        <c:if test="${num==0}">
          <input type="text" name="subject" id="subject" size="50">
        </c:if>
        <c:if test="${num!=0}">
          <input type="text" name="subject" id="subject" size="50" value="[답글]">
        </c:if>
      </td>
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
        <c:if test="${num==0}">
          <input type="submit" value="글쓰기">
        </c:if>
        <c:if test="${num!=0}">
          <input type="submit" value="답글쓰기">
        </c:if>
        <input type="reset" value="다시쓰기">
        <input type="button" value="목록보기" onclick="location.href='/list.do'">
      </td>
    </tr>
  </table>
  </form>
</body>
</html>