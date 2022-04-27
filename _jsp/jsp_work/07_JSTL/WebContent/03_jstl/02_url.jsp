<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%--02_url.jsp--%>
<%--
URL 처리태그
1.redirect 태그 : response.sendRedirect("url"과 같은 기능)
2.url 태그 : URL을 생성해서 변수에 저장 할 때 사용
3.import 태그 : <jsp:include>태그와 비슷한 기능이핟

url태그 : URL을 생성해서 변수에 저장할 때 사용
url 태그 형식
<c:url var="변수" value="aa.jsp" scope="session">
  <c:param name="name" value="park"/>
</c:url>
var : 생성된 url이 저장될 변수
value : 생성될 url 
scope : 변수에 저장될 범위 지정
        page request session application(프로젝트)
#value속성에 올 수 있는 3가지 값
완전url : http://ip:port/컨텍스트이름/중간이름/a.jsp
웹 어플리케이션 내에서 절대 경로 : /bb.jsp(자신을 기준으로 한다)
현재 경로에 대한 상대경로 : ../01_jstl/03_if_tag.jsp
--%>
<!-- 방법1 완전url-->
<c:url var="u1" value="http://localhost:9001/07_JSTL/01_jstl/03_if_tag.jsp"/>
<!-- 방법2 절대경로 -->
<c:url var="u2" value="/01_redirect.jsp"/>
<!-- 방법3 상대경로 -->
<c:url var="u3" value="../01_jstl/03_if_tag.jsp"/>

${u1}<br>
${u2}<br>
${u3}<br>

<%--
<c:import url="${u3}" var="im"/>
${im}
 --%>