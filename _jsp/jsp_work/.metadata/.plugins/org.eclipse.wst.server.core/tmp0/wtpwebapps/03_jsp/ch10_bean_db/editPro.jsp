<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"
    %>
<%
request.setCharacterEncoding("UTF-8");
%>
<%--editPro.jsp--%>
<jsp:useBean id="dto" class="mypa.BoardDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>
<%
BoardDAO dao=new BoardDAO(); //객체생성
int x=dao.updateBoard(dto); //dao메서드 호출 dto넘긴다, x값을 받는다
if(x==1){ //정상적으로 수정
	response.sendRedirect("list.jsp");
}else if(x==-1){//암호틀림
	%>
	<script>
	alert("암호틀림");
	history.back();
	</script>
	<%
}
%>