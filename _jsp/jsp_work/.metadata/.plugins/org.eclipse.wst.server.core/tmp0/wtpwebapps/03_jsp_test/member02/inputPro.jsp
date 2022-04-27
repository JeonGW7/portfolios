<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*"
    %>
<%!
//선언부
String DRIVER="com.mysql.jdbc.Driver";
String URL="jdbc:mysql://localhost:3306/testdb2";
String USER="root";
String PWD="12345";
%>
<%
request.setCharacterEncoding("UTF-8");
try{
	Class.forName(DRIVER); //드라이버 로딩
	Connection con=DriverManager.getConnection(URL,USER,PWD); //DB연결
	//데이터 받기
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	String name=request.getParameter("name");
	String tel=request.getParameter("tel");
	String addr=request.getParameter("addr");
	String sql="insert into member2 values(?,?,?,?,?)";
	PreparedStatement pstmt=con.prepareStatement(sql);//생성시 인자 들어간다
	//?값 채우기
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	pstmt.setString(3, name);
	pstmt.setString(4, tel);
	pstmt.setString(5, addr);
	pstmt.executeUpdate(); //쿼리수행 
	pstmt.close();
	con.close();
	out.println("회원가입 성공");
}catch(Exception ex){
	out.println("<script>");
	out.println("alert('SQL예외:'"+ex+")");
	out.println("history.back()");
	out.println("</script>");
}/*finally{
	try{
		if(pstmt != null){pstmt.close();}
		if(con != null){con.close();}
	}catch(Exception ex2){}
}*/
%>