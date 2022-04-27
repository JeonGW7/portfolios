<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--Top.jsp --%>
<%
String adminId=(String)session.getAttribute("adminId");
String log="";
String mem="";
if(adminId==null){
	log="<a href='adminLoginForm.jsp'>로그인</a>";
	mem="<a href='inputForm.jsp'>회원가입</a>";
}else{//로그인 상태이면
	log="<a href='adminLogOut.jsp'>로그아웃</a>";
	mem="<a href='updateMember.jsp'>내정보수정</a>";
}
%>
<table width="90%" align="center" bgcolor="#ffff99">
  <tr bgcolor="#ffcc00">
    <td align="center"><b><%=log %></b></td>
    <td align="center"><b><%=mem %></b></td>
    <td align="center"><b><a href="productList.jsp">상품목록</a></b></td>
    <td align="center"><b><a href="cartList.jsp">장바구니</a></b></td>
    <td align="center"><b><a href="orderList.jsp">구매목록</a></b></td>
     
  </tr>
</table>