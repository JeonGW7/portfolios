<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*"
    import="java.util.*"    
    %>
<%--writePro.jsp--%>
<%!
String DRIVER="com.mysql.jdbc.Driver";
String URL="jdbc:mysql://localhost:3306/mydb";
String USER="root";
String PWD="12345";
%>
<%
request.setCharacterEncoding("UTF-8");
try{
	Class.forName(DRIVER); //드라이버 로딩
	Connection con=DriverManager.getConnection(URL,USER,PWD);//DB연결
	//입력내용받기
	String writer=request.getParameter("writer");
	String subject=request.getParameter("subject");
	String content=request.getParameter("content");
	String pw=request.getParameter("pw");
	String sql="insert into board2(writer,subject,content,pw,wdate,ip) values(?,?,?,?,NOW(),?)";
	PreparedStatement pstmt=con.prepareStatement(sql);//생성시 인자가 들어간다
	//?값 채우기
	pstmt.setString(1, writer);
	pstmt.setString(2, subject);
	pstmt.setString(3, content);
	pstmt.setString(4, pw);
	//날짜
	String ip=request.getRemoteAddr();//ip구한다
	pstmt.setString(5, ip);
	pstmt.executeUpdate(); //insert,update,delete
	pstmt.close();
	con.close();
	//리스트로 가게 해준다
	response.sendRedirect("list.jsp");
}catch(Exception ex){
	out.println("예외:"+ex);
	out.println("<script>");
	out.println("alert('sql예외'"+ex+")");
	out.println("history.back()");
	out.println("</script>");
}
%>