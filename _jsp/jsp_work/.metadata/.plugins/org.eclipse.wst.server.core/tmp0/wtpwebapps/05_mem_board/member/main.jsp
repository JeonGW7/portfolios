<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--main.jsp--%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main.jsp</title>
</head>
<body bgcolor="ivory">
  <%
  if(session.getAttribute("id")==null){
	  //로그인 하지 않았을 경우
	  %>
	  <table width="90%" height="90%" align="center">
	    <tr bgcolor="margenta">
	      <td align="left">
	        <img src="../imgs/aaa.GIF" width="100" height="50">
	      </td>
	      <td>&nbsp;</td>
	      <td height="15%" align="right">
	        <input type="button" value="로그인" onclick="location='loginForm.jsp'">
	        <input type="button" value="회원가입" onclick="location='inputForm.jsp'">
	        <input type="button" value="게시판" onclick="location='../boardmysql/list.jsp'">
	      </td>
	    </tr>
	    <tr>
	      <td colspan="2">
	                   메인입니다
	      </td>
	    </tr>
	  </table>
	  <% 
  }else{
	  //로그인 한 경우 
	  %>
	  <table width="90%" height="90%" align="center">
	    <tr height="10%" bgcolor="cyan">
	      <td align="left">
	        <a href="main.jsp">HOME</a>
	      </td>
	      <td width="70%">
	                    반갑습니다 
	      </td>
	      <td width="30%" colspan="2" valign="top">
	       <%=(String)session.getAttribute("id") %>님 환영합니다
	       <form method="post" action="logOut.jsp">
	         <input type="submit" value="로그아웃">
	         <input type="button" value="회원정보수정" onClick="location='modify.jsp'">
	         <input type="button" value="게시판" onclick="location='../boardmysql/list.jsp'">
	       </form>
	      </td>
	    </tr>
	    <tr>
	      <td colspan="2">
	                   본문
	      </td>
	    </tr>
	  </table>
	  <%
  }//else-end
  %>
</body>
</html>