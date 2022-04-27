<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="java.sql.*"
    %>
<%!
String DRIVER="com.mysql.jdbc.Driver";
String URL="jdbc:mysql://localhost:3306/mydb";
String USER="root";
String PWD="12345";
%>
<%
request.setCharacterEncoding("UTF-8");
String num=request.getParameter("num"); //content.jsp에서 넘겨준 num받기 
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>editForm.jsp</title>
  <style type="text/css">
  h2{text-align: center;}
  table{margin:auto; width: 500;}
  </style>
  <script type="text/javascript">
   function check(){
	   if(document.editForm.pw.value==''){
		   alert("암호를 입력하세요");
		   document.editForm.pw.focus();
		   return false;
	   }//if-end
	   document.editForm.action="editPro.jsp?num=<%=num%>"; 
	   document.editForm.submit(); //전송
   }
  </script>
</head>
<body>
<%
Class.forName(DRIVER); //드라이버 로딩
Connection con=DriverManager.getConnection(URL,USER,PWD); //DB연결
Statement stmt=con.createStatement(); //Statement생성
String sql="select * from board2 where num="+num;
ResultSet rs=stmt.executeQuery(sql); //Statement는 실행시 인자 들어간다
while(rs.next()){
	String writer=rs.getString("writer");
	String subject=rs.getString("subject");
	String content=rs.getString("content");
	%>
	<h2>글수정</h2>
	<form name="editForm" method="post">
	  <table border="1">
	    <tr>
	      <td>글쓴이</td>
	      <td><input type="text" name="writer" value="<%=writer%>" size="20"></td>
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
	        <input type="button" value="글수정" onclick="javaScript:check()">
	        <input type="button" value="이전으로" onclick="history.back()">
	        <a href="list.jsp">리스트</a>
	      </td>
	    </tr>
	  </table>
	</form>
	<% 
}//while-end
%>
</body>
</html>