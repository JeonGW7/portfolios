<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="member.*"
    %>
<%--loginPro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
String id=request.getParameter("id");
String pw=request.getParameter("pw");
MemberDAO dao=MemberDAO.getDao(); //dao객체얻기
int x=dao.userCheck(id, pw); //dao메서드 호출
if(x==1){ //로그인 성공
	session.setAttribute("id", id);
	response.sendRedirect("main.jsp");
}else if(x==0){ //암호가 틀린경우
%>
<script>
alert("암호가 틀립니다");
history.back();
</script>
<%
}else if(x==-1){ //없는 ID인경우
%>
<script>
alert("없는 ID입니다");
history.back();
</script>
	<%	
}
%>