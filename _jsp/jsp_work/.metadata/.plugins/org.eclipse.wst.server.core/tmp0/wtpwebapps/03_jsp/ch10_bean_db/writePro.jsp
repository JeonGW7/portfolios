<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"   
    %>
<%
request.setCharacterEncoding("UTF-8");
%>
<%--웹 화면에서 입력한내용을 dto에 저장 --%>
<jsp:useBean id="dto" class="mypa.BoardDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

<%
BoardDAO dao=new BoardDAO(); //객체생성
String ip=request.getRemoteAddr(); //ip
dto.setIp(ip);
dao.insertDB(dto); //dao메서드 호출
out.println("글쓰기 성공");
response.sendRedirect("list.jsp");
%>