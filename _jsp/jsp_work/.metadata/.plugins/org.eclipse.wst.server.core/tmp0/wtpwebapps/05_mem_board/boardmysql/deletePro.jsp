<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardmysql.*"
    %>
<%--deletePro.jsp--%>
<%
//deleteForm.jsp에서 보내준 데이터 받기 
int num=Integer.parseInt(request.getParameter("num"));
String pageNum=request.getParameter("pageNum");
String pw=request.getParameter("pw");
BoardDAO dao=BoardDAO.getDao(); //dao객체얻기
int x=dao.deleteBoard(num, pw); //dao메서드 호출
if(x==1){ //삭제성공
	response.sendRedirect("list.jsp?paegNum="+pageNum);
}else if(x==0){ //암호틀림,삭제실패
	%>
	<script>
	  alert("암호가 틀립니다");
	  history.back();
	</script>
	<%
}
%>