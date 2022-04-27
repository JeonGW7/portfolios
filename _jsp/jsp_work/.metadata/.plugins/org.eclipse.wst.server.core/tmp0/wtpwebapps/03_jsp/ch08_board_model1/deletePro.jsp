<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*"
    %>
<%--editPro.jsp--%>
<%!
String DRIVER="com.mysql.jdbc.Driver";
String URL="jdbc:mysql://localhost:3306/mydb";
String USER="root";
String PWD="12345";
%>

<%
request.setCharacterEncoding("UTF-8");
String num=request.getParameter("num");
String pw=request.getParameter("pw");

Class.forName(DRIVER);//드라이버 로딩
Connection con=DriverManager.getConnection(URL,USER,PWD);//DB연결

String sql="delete from board2 where num=? and pw=?";
PreparedStatement pstmt=con.prepareStatement(sql);

//?값 채우기
pstmt.setInt(1, Integer.parseInt(num));
pstmt.setString(2, pw);

pstmt.executeUpdate();

pstmt.close();
con.close();

response.sendRedirect("list.jsp");
%>