<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*"
    import="javax.sql.*"
    import="javax.naming.*"
    %>
<%--usePool.jsp--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>usePool.jsp</title>
</head>
<body>
  <h2>커넥션 풀사용</h2>
  <table border="1">
    <tr>
      <th>이름</th>
      <th>이메일</th>
      <th>주소</th>
    </tr>
    <%
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    //Context ct=new InitialContext();
    //Context ct2=(Context)ct.lookup("java:comp/env");
    //DataSource ds=(DataSource)ct2.lookup("jdbc/mysql");
    Context ct=new InitialContext();
    DataSource ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
    con=ds.getConnection(); //커넥션 얻기
    stmt=con.createStatement(); //Statement 생성
    rs=stmt.executeQuery("select * from test");
    while(rs.next()){
    	String name=rs.getString("name");
    	String email=rs.getString("email");
    	String addr=rs.getString("addr");
    	%>
    	<tr>
    	  <td><%=name %></td>
    	  <td><%=email %></td>
    	  <td><%=addr %></td>
    	</tr>
    	<% 
    }//while-end
    rs.close();
    stmt.close();
    con.close();
    %>
   <%--
   Context ct=new InitialContext(); //현재 환경의 naming Context획득하기 
   -InitialContext()는 웹어플리케이션이 처음으로 배치될 때 설정되고 
       모든 설정된 엔트리와 자원은 JNDI namespace의 java:comp/env에 놓이게 된다
       그래서 접근을 Context ct=new InitialContext() 이렇게 한다
   Context ct2=(Context)ct.lookup("java:comp/env");
   - JNDI에 등록된 자원 이름(즉, 컨텍스트에 대한 상대적인 이름이 java:comp/env 인 것이다)
   - JNDI : java Naming Directory Interface
   DataSource ds=(DataSource)ct2.lookup("jdbc/mysql");
    --%>
    
  </table>
</body>
</html>