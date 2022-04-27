<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="member.*"
    %>
<%--inputPro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="dto" class="member.MemberDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

<%
MemberDAO dao=MemberDAO.getDao(); //dao객체 얻기
dao.insertMember(dto); //dao메서드 호출하면서 dto를 넘긴다
//out.println("회원 가입 완료");
response.sendRedirect("main.jsp");
%>