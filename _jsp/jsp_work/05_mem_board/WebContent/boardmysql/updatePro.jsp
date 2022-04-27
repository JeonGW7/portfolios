<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardmysql.*"
    %>
<%--updatePro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="boardDTO" class="boardmysql.BoardDTO">
  <jsp:setProperty name="boardDTO" property="*"/>
</jsp:useBean>

<%
String pageNum=request.getParameter("pageNum");
BoardDAO dao=BoardDAO.getDao(); //dao객체 얻기
int x=dao.updateBoard(boardDTO); //dao메서드 호출
if(x==1){ //수정완료
	response.sendRedirect("list.jsp?pageNum="+pageNum);
}else if(x==-1){
	%>
	<script>
	alert("암호가 틀립니다");
	history.back();
	</script>
	<%
}//else-if-end
%>