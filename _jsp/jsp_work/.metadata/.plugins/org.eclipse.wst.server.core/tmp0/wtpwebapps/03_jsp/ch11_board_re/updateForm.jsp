<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    %>
<%--updateForm.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
//content.jsp가 보내준 값 받기
int nowPage=Integer.parseInt(request.getParameter("page"));
int num=Integer.parseInt(request.getParameter("num"));
BoardDAO dao=new BoardDAO(); //객체생성
BoardDTO dto=dao.getBoard(num); //dao메소드 호출,dto를 받는다
String name=dto.getName();
String subject=dto.getSubject();
String content=dto.getContent();
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>updateForm.jsp</title>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto; width: 70%;}
  </style>
  <script type="text/javascript">
    function check(){
    	if(document.updateForm.pw.value==''){
    		alert("암호는 필수 입력 해야 합니다");
    		document.updateForm.pw.focus();
    		return false;
    	}
    	document.updateForm.submit();//전송
    }
  </script>
</head>
<body>
  <h2>글수정 폼</h2>
  <form name="updateForm" method="post" action="updatePro.jsp">
    <table border="1">
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" value="<%=name%>" size="20"></td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" value="<%=subject%>" size="50"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="content" rows="10" cols="50"><%=content %></textarea>
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" size="20"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="글수정" onclick="check()"> 
          <input type="reset" value="다시수정"> 
          <input type="button" value="뒤로" onclick="history.back()"> 
          <input type="hidden" name="num" value="<%=num %>"> 
          <input type="hidden" name="page" value="<%=nowPage %>"> 
        </td>
      </tr>
    </table>
  </form>
</body>
</html>