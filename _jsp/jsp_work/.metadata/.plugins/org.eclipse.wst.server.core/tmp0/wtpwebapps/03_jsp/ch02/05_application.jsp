<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>05_application.jsp</title>
</head>
<body>
<%--web.xml에 설정된 초기 파라미터 실습 --%>
<ol>
  <li>이름:<%=application.getInitParameter("name") %>
  <li>ID:<%=application.getInitParameter("id") %>
  <p>
  <li>서버정보:<%=application.getServerInfo() %>
  <%--aa.html 그냥 만들어만 준다 --%>
  <li>aa.html 타입 알아보기: <%=application.getMimeType("aa.html") %>
  <%--
  MIME : Multi purpose Internet Mail Extensions
  		 은 인터넷 전자우편으로 텍스트 이외의 음성,동영상 등
  		 다양한 데이터를 보내기 위한 표준이다
  		 예 : text/html  text/xml  image/jpg  image/gif
  		 
  		 따라서 JSP 컨테이너가 클라이언트에게 문서를 보낼 때
  		 이 문서는 어떤 형식의 문서이다(text/html)이라고 지정해 주어야 한다 
   --%>
   <p>
   <li>메이저버전:<%=application.getMajorVersion() %><%--정수버전 --%>
   <li>마이너버전:<%=application.getMinorVersion() %><%--소수이하 버전 --%>
   <p>
   <li>실제 경로:<%=application.getRealPath("/") %>
   <%--
   D:\_jsp\jsp_work\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\03_jsp
   C:\Tomcat 8.0\webapps\03_jsp
    --%>
</ol>
<%
application.log("2022년 02월 07일");
%>
</body>
</html>