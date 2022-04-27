<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--writeForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <script type="text/javascript">
  function check(ff){
	  if(ff.writer.value==''){
		  alert("이름을 입력하세요");
		  ff.writer.focus();
		  return false; //서버로 못넘어가게 한다
	  }
	  if(ff.subject.value==''){
		  alert("글제목을 입력하세요");
		  ff.subject.focus();
		  return false; //서버로 못넘어가게 한다
	  }
	  if(ff.content.value==''){
		  alert("글내용을 입력하세요");
		  ff.content.focus();
		  return false; //서버로 못넘어가게 한다
	  }
	  if(ff.pw.value==''){
		  alert("암호를 입력하세요");
		  ff.pw.focus();
		  return false; //서버로 못넘어가게 한다
	  }
	  return true;
  }
  </script>
</head>
<body>
  <form method="post" action="writePro.do" onSubmit="return check(this)">
    <table border="1" align="center" width="60%">
      <tr>
        <td colspan="2" align="center">
          <font size="5">글쓰기 폼</font>
        </td>
      </tr>
      <tr>
        <td>이름</td>
        <td><input type="text" name="writer" id="writer" size="30"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" id="subject" size="50"></td>
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
        <td>IP</td>
        <td><input type="text" name="ip" value="<%=request.getRemoteAddr()%>"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="글등록">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>