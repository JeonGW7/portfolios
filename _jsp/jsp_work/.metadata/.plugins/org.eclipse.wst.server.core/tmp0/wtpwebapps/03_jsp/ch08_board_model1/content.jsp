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
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>content.jsp</title>
  <style type="text/css">
  h2{text-align: center;}
  table{margin:auto; width: 450;}
  </style>
</head>
<body>
  <h2>글내용보기</h2>
  <%
  String num=request.getParameter("num");
  int readcount=0;//조회수 변수
  Class.forName(DRIVER);
  Connection con=DriverManager.getConnection(URL,USER,PWD); //DB연결
  String sql="select * from board2 where num="+num;
  Statement stmt=con.createStatement(); //Statement생성
  ResultSet rs=stmt.executeQuery(sql); //Statement는 실행시 인자 들어간다 
  %>
  <table border="1" align="center">
    <tr>
      <td>
        <a href="writeForm.jsp">글쓰기</a>&nbsp;
        <a href="editForm.jsp?num=<%=num%>">글수정</a>&nbsp;
        <a href="deleteForm.jsp?num=<%=num%>">글삭제</a>&nbsp;
        <a href="list.jsp">리스트</a>&nbsp;
      </td>
    </tr>
  </table>
  <% 
  while(rs.next()){
	  String writer=rs.getString("writer");
	  String subject=rs.getString("subject");
	  String content=rs.getString("content");
	  String pw=rs.getString("pw");
	  String wdate=rs.getString("wdate"); //날짜도 String으로 처리
	  readcount=rs.getInt("readcount");
	  readcount++; //조회수 증가
	  String ip=rs.getString("ip");
	  %>
	  <table border="1">
	    <tr>
	      <td>글쓴이</td>
	      <td><%=writer %></td>
	    </tr>
	    <tr>
	      <td>글제목</td>
	      <td><%=subject %></td>
	    </tr>
	    <tr>
	      <td>날짜</td>
	      <td><%=wdate %></td>
	    </tr>
	    <tr>
	      <td>암호</td>
	      <td>
	      <% 
	      if(session.getAttribute("id")=="admin"){
	    	  out.println(pw);
	      }else{
	    	  out.println("***");
	      }
	      %>
	      </td>
	    </tr>
	    <tr>
	      <td>조회수</td>
	      <td><%=readcount %></td>
	    </tr>
	    <tr>
	      <td>IP</td>
	      <td><%=ip %></td>
	    </tr>
	    <tr>
	      <td>글내용</td>
	      <td>
	      <%
	      content=content.replaceAll("\n", "<br>");
	      %>
	      <%=content %>
	      </td>
	    </tr>
	  </table>
	  <% 
  }//while-end
  rs.close();
  stmt.close();
  //DB에 조회수가 증가하게 하는 기능 넣기
  sql="update board2 set readcount=? where num=?";
  PreparedStatement pstmt=con.prepareStatement(sql); //생성시 인자 들어감
  // ?값 채우기
  pstmt.setInt(1, readcount);
  pstmt.setInt(2, Integer.parseInt(num)); //DB는 다 정수타입이기 때문에 
  pstmt.executeUpdate(); //쿼리 수행
  pstmt.close();
  con.close();
  %>
</body>
</html>