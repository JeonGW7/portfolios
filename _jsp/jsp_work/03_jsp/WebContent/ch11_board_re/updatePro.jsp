<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    %>
<%--updatePro.jsp --%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dto" class="boardre.BoardDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

<%
int num=Integer.parseInt(request.getParameter("num"));
int nowPage=Integer.parseInt(request.getParameter("page"));
BoardDAO dao=new BoardDAO(); //객체생성
BoardDTO dto2=dao.getBoard(num); //암호비교하려고 가져옴
String inPw=request.getParameter("pw"); //updateForm에서 가져온 암호
String dbPw=dto2.getPw(); //DB암호
if(inPw.equals(dbPw)){
	//암호가 일치하면 글수정
	dao.updateBoard(dto); //dao메서드호출, dto를 넘긴다
	response.sendRedirect("list.jsp?page="+nowPage);
}else{
	//암호가 일치하지 않으면
	%>
	<script>
	alert("암호가 틀립니다");
	history.back();
	</script>
	<%
}
%>