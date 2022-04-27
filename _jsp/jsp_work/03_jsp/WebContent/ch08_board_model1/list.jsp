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
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>list.jsp</title>
  <style type="text/css">
    h2{text-align:center;}
    table{
    margin:auto; 
    border: 1px solid black;
    width:450;
    }
  </style>
</head>
<body>
  <%--list.jsp--%>
  <h2>게시판 리스트</h2>
  <table>
	<tr>
	  <td align="right">
	    <a href="writeForm.jsp">글쓰기</a>
	  </td>
	</tr>
  </table>
  <%
  Class.forName(DRIVER); //드라이버 로딩
  Connection con=DriverManager.getConnection(URL,USER,PWD);
  Statement stmt=con.createStatement(); //Statement생성
  String sql="select * from board2 order by num desc";
  ResultSet rs=stmt.executeQuery(sql); //실행시 인자가 들어감
  %>
  <table border="1">
    <tr>
      <th>글번호</th>
      <th>글제목</th>
      <th>작성자</th>
      <th>작성일</th>
      <th>조회수</th>
    </tr>
    <%
    while(rs.next()){
    	int num=rs.getInt("num");
    	String writer=rs.getString("writer");
    	String subject=rs.getString("subject");
    	String wdate=rs.getString("wdate");
    	String pw=rs.getString("pw");
    	int readcount=rs.getInt("readcount");
    	%>
    	<tr>
    	  <td><%=num %></td>
    	  <%--글 제목을 클릭하면 글 내용보기로 가게한다 --%>
    	  <td>
    	    <a href="content.jsp?num=<%=num%>"><%=subject %></a>
    	  </td>
    	  <td><%=subject %></td>
    	  <td><%=writer %></td>
    	  <td><%=wdate %></td>
    	  <td><%=readcount %></td>
    	  <td>
    	    <a href="deletePro.jsp?num=<%=num%>&pw=<%=pw%>">삭제</a>
    	  </td>
    	</tr>
    	<% 
    }//while-end
    %>
  </table>
</body>
</html>