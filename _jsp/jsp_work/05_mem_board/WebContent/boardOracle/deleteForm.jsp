<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--deleteForm.jsp--%>
<%
/*
if(session.getAttribute("id")==null){
	out.println("<h2>로그인을 해야 합니다</h2>");
	return;
}//if-end
*/
//content.jsp 데이터 받기
int num=Integer.parseInt(request.getParameter("num"));
String pageNum=request.getParameter("pageNum");
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <link rel="stylesheet" type="text/css" href="style.css">
  <script>
  function check(){
	  if(document.delForm.pw.value==''){
		  alert("암호를 입력하세요");
		  document.delForm.focus();
		  return false;
	  }//if-end
	  document.delForm.submit(); //서버로 전송
  }//check()-end
  </script>
</head>
<body>
  <h2>글삭제</h2>
  <form name="delForm" method="post" action="deletePro.jsp?pageNum=<%=pageNum%>">
    <table border="1">
      <tr>
        <td>
          <b>암호를 입력 하세요</b>
        </td>
      </tr>
      <tr>
        <td>
            암호입력:<input type="password" name="pw" id="pw" size="20"> ※암호는 필수 입력
          <input type="hidden" name="num" value="<%=num%>">
        </td>
      </tr>
      <tr>
        <td align="center">
          <input type="button" value="글삭제" onclick="check()">
          <input type="button" value="글목록" onclick="document.location='list.jsp?pageNum=<%=pageNum%>'">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>