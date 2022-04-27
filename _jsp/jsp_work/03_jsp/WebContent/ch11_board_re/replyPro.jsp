<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    %>
<%--replyPro.jsp --%>
<%
request.setCharacterEncoding("UTF-8");
%>
<%--replyForm.jsp에서 보낸준 데이터를 dto에 저장--%>
<jsp:useBean id="dto" class="boardre.BoardDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>
<%
int num=Integer.parseInt(request.getParameter("num"));
int nowPage=Integer.parseInt(request.getParameter("page"));
BoardDAO dao=new BoardDAO(); //객체생성
BoardDTO dto2=dao.getBoard(num); //dao메서드 호출
int pos=dto2.getPos(); //현재 위치 얻기
int depth=dto2.getDepth(); //현재 글 깊이
dto.setPos(pos); //setter작업 
dto.setDepth(depth); //setter작업
dao.replyPos(dto); //답글위치확보
dao.replyBoard(dto); //답글쓰기
response.sendRedirect("list.jsp?page="+nowPage);
%>