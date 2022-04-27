<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    %>
<%--deletePro.jsp--%>
<%
int num=Integer.parseInt(request.getParameter("num"));
int nowPage=Integer.parseInt(request.getParameter("page"));
String inPw=request.getParameter("pw");
String dbPw="";
BoardDAO dao=new BoardDAO(); //객체생성
BoardDTO dto=dao.getBoard(num);
dbPw=dto.getPw();
if(inPw.equals(dbPw)){
	//암호가 일치하면 글삭제
	dao.deleteBoard(num); //dao메서드 호출
	response.sendRedirect("list.jsp?page="+nowPage);
}else{
	//암호가 틀릴때
	%>
	<script>
	alert("암호가 틀립니다");
	history.back();
	</script>
	<%
}
%>