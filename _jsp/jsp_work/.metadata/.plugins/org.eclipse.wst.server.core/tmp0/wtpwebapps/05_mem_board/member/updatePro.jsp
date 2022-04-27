<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="member.*"
    %>
<%--updatePro.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="dto" class="member.MemberDTO">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

<%
String id=(String)session.getAttribute("id");
dto.setId(id);
MemberDAO dao=MemberDAO.getDao(); //dao객체얻기
dao.updateMember(dto); //dao메서드 호출
%>
<html>
  <body>
    <table>
      <tr>
        <td align="center">
          <b>회원정보 수정이 되었습니다</b>
        </td>
      </tr>
      <tr>
        <td>
          <form>
            <input type="button" value="홈으로" onclick="location='main.jsp'">
          </form>
          2초후에 홈으로 이동합니다
          <meta http-equiv="Refresh" content="2;url=main.jsp">
        </td>
      </tr>
    </table>
  </body>
</html>