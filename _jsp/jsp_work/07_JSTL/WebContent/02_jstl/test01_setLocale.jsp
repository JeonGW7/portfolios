<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--test01_setLocale.jsp--%>
<%--
Locale : 각 나라의 언어 표기를 설정하는 것이다
Locale 지정 2가지 태그
setLocale : 국제화 태그들이 사용할 Locale을 지정한다
request.Encoding : 요청 파라미터값 인코딩처리
default locale : 제어판 국가별 설정에 설정되어 있는 것으로 표기된다  
--%>
<html>
  <body>
    <h2>언어_나라</h2>
    <h2>ko_kr</h2>
         디폴트 locale : <%=response.getLocale()%>
    <br>
    <pre>
          디폴트 locale: 현재 컴퓨터에 국가별 설정에 되어있는 언어_나라가된다
          제어판 국가및언어 가서 확인 할 수 있다
    </pre>
    <h2>en 영어/로케일 설정</h2>
    <fmt:setLocale value="en"/>
    locale : <%=response.getLocale()%>
    <h2>ja 일본어/로케일 설정</h2>
    <fmt:setLocale value="ja"/>
    locale : <%=response.getLocale()%>
  </body>
</html>
