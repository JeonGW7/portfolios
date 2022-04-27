<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*"
    %>
<%--editPro.jsp open JDK1.8/MaiaDB--%>
<%!
String DRIVER="com.mysql.jdbc.Driver";
String URL="jdbc:mysql://localhost:3306/mydb";
String USER="root";
String PWD="12345";
%>
<%
request.setCharacterEncoding("UTF-8");
String num=request.getParameter("num");
Class.forName(DRIVER); //드라이버 로딩
Connection con=DriverManager.getConnection(URL,USER,PWD); //DB연결
String sql="select * from board2 where num="+num;
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
PreparedStatement pstmt=null;
if(!(rs.next())){
	out.println("해당 자료 없음");
}else{//수정이 가능 할 때
	String dbpw=rs.getString("pw");
	if(dbpw.equals(request.getParameter("pw"))){
		//암호가 일치하면 글 수정 가능
		String writer=request.getParameter("writer");
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		
		sql="update board2 set writer=?, subject=?, content=? where num="+num;
		pstmt=con.prepareStatement(sql);
		//?값 채우기
		pstmt.setString(1,writer);
		pstmt.setString(2,subject);
		pstmt.setString(3,content);
		pstmt.executeUpdate(); //쿼리 수행
		rs.close();
		stmt.close();
		pstmt.close();
		con.close();
		response.sendRedirect("list.jsp");
	}else{//암호가 틀릴때
		%>
		<script>
		alert("암호가 다릅니다");
		history.back();
		</script>
		<%
	}//else-end
}//else-end
%>