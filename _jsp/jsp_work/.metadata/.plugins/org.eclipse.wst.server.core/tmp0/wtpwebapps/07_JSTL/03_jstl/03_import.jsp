<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%--03_import.jsp--%>
<%--
import 태그 : <jsp:include> 액션 태그와 비슷한 기능을 제공한다
<jsp:include>액션은 같은 프로젝트에서만 가능하다
import 태그는 다른 프로젝트는 물론 외부 url도 포함이 가능하다 
import 태그 형식
<c:import url="https:/www.daum.net"
		  charEncoding="utf-8"
		  var="daum"
		  scope="session"
   <c:param name="" value=""/>
   <c:param name="name" value="슈퍼맨"/>
</c:import>   
--%>
<%--
url="https:/www.daum.net" : 읽어올 url
		  charEncoding="utf-8"  : 읽어올 데이터 캐릭터셋
		  var="daum" : 변수이름
		  scope="session" : 적용범위
--%>
<%--실습
header.jsp
footer.jsp
https://www.daum.net
02_url.jsp
04_import.jsp
--%>
