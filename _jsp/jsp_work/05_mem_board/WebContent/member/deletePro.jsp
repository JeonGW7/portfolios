<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="member.*"
    %>
<%--deletePro.jsp
x=1 탈퇴성공
x=-1 암호틀림
x=0 없는ID
--%>
<%
request.setCharacterEncoding("UTF-8");
String id=(String)session.getAttribute("id"); //로그인을 하면 session으로 부터 id얻어옴
String pw=request.getParameter("pw");
MemberDAO dao=MemberDAO.getDao(); //dao객체 얻기
int x=dao.deleteMember(id, pw); //dao메서드 호출
if(x==1){
	session.invalidate(); //세션무효화 
	%>
	<body>
	  <form method="post" action="main.jsp">
	    <h3>회원 탈퇴 완료</h3>
	    <input type="submit" value="홈으로">
	    <br>
	    5초후에 홈으로 이동합니다
	    <meta http-equiv="Refresh" content="5;url='main.jsp'">
	  </form>
	</body>
	<%
}else if(x==-1){
	%>
	<script>
	alert("암호가 틀립니다");
	history.back();
	</script>
	<%
}
%>