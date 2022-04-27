<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--deleteForm.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
//content.jsp가 보내준 데이터 받기
int nowPage=Integer.parseInt(request.getParameter("page"));
int num=Integer.parseInt(request.getParameter("num"));
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>deleteForm.jsp</title>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto; width: 50%;}
  </style>
  <script type="text/javascript">
  function check(){
	  if(document.delForm.pw.value==''){
		  alert("암호는 필수 입력");
		  document.delForm.pw.focus();
		  return false;
	  }
	  document.delForm.submit(); //전송
  }
  </script>
</head>
<body>
  <h2>삭제폼</h2>
  <form name="delForm" method="post" action="deletePro.jsp">
    <table border="1">
      <tr>
        <td>암호</td>
        <td>
        <input type="password" name="pw" size="20">
        <input type="hidden" name="page" value="<%=nowPage %>">
        <input type="hidden" name="num" value="<%=num %>">
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="글삭제" onclick="check()">
          <input type="reset" value="다시쓰기">
          <input type="button" value="뒤로" onclick="history.bacK()">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>