<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardmysql.*"
    %>
<%--updateForm.jsp--%>  
<%
request.setCharacterEncoding("UTF-8");

if(session.getAttribute("id")==null){
	out.println("<h2>로그인을 해야 합니다</h2>");
	return;
}//if-end

%>  
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>updateForm.jsp</title>
  <link rel="stylesheet" type="text/css" href="style.css">
  <script>
  function check(){
	  if(document.updateForm.pw.value==''){
		  alert("암호를 입력하세요");
		  document.updateForm.pw.focus();
		  return false;
	  }
	  document.updateForm.submit(); //전송
  }
  </script> 
</head>
<%
//content.jsp가 보내준 데이터 받기 
int num=Integer.parseInt(request.getParameter("num"));
String pageNum=request.getParameter("pageNum");
BoardDAO dao=BoardDAO.getDao(); //dao얻기
BoardDTO dto=dao.getUpdate(num); //dao메서드 호출,dto받는다
%>
<body>
  <h2>글수정</h2>
  <form name="updateForm" method="post" action="updatePro.jsp?pageNum=<%=pageNum%>">
    <table border="1">
      <tr>
        <td>이름</td>
        <td>
        <input type="text" name="writer" id="writer" size="30" value="<%=dto.getWriter()%>">
        <input type="hidden" name="num" value="<%=num%>">
        </td>       
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" id="subject" size="50" value="<%=dto.getSubject()%>"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="content" id="content" rows="10" cols="50"><%=dto.getContent()%></textarea>
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="20">*필수입력</td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="글수정" onclick="check()">
          <input type="reset" value="다시쓰기">
          <input type="button" value="리스트" onclick="location='list.jsp?pageNum=<%=pageNum%>'">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>