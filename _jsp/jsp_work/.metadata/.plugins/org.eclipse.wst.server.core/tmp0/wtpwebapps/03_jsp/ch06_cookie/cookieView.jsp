<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<%--cookieView.jsp--%>
<%
Cookie cookies[]=request.getCookies(); //클라이언트의 모든 쿠키를 얻어낸다 
String visitor=""; //변수

if(cookies != null){ //쿠키가 있으면
	for(int i=0;i<cookies.length;i++){
		if(cookies[i].getName().equals("visitor")){
			visitor=URLDecoder.decode(cookies[i].getValue()); //값을 얻는다
		}
	}
}
%>

<%
if(visitor==null || visitor.equals("")){ //처음방문이면
%>
  <form method="post" action="cookieMake.jsp">
     이름을 입력하세요<br>
     <input type="text" name="visitor" value="박지성">
     <input type="submit" value="전송">
  </form>
<%
}else{ //처음방문이 아닐때 
	out.println("<h3>"+visitor+"님 반갑습니다</h3>");	
}
%>
