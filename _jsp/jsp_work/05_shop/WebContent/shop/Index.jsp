<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--Index.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Index.jsp</title>
  <link href="style.css" rel="stylesheet" type="text/css">
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript" src="script.js"></script>
</head>
<body bgcolor="#996600" topmargin="100">
  <%@ include file="top.jsp" %>
  <table width="80%" align="center" bgcolor="ffff99" height="100%">
    <%
    memId=(String)session.getAttribute("memId");
    if(memId != null){//로그인 상태이면
    	%>
    	<tr>
    	  <td align="center">
    	    <%=memId %>님 방문 해주셔서 감사합니다 
    	  </td>
    	</tr>
    	<tr>
    	  <td align="center">
    	    <a href="productList.jsp">상품목록보기</a>
    	  </td>
    	</tr>
    	<%
    }else{//로그인 상태가 아니면
    	%>
    	<tr>
    	  <td align="center">
    	        로그인 하신 후에 이용해 주세요<br>
    	    <a href="loginForm.jsp">로그인</a>
    	  </td>
    	</tr>
    	<%
    }//else-end
    %>
  </table>
  <%@ include file="bottom.jsp" %>
</body>
</html>