<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--04_import.jsp
import 태그는 url를 변수에 넣고
변수를 출력하고 싶은 곳에서 ${변수}이렇게 출력한다
--%>
<fmt:requestEncoding value="UTF-8"/>
<c:import url="header.jsp" var="hh">
  <c:param name="name" value="홍길동"/>
</c:import>
<c:import url="http://www.nate.com" var="nate"/>
<c:import url="https://www.naver.com" var="naver"/>
<c:import url="https://www.daum.net" var="daum"/>
<c:import url="http://localhost:9001/05_mem_board/boardmysql/list.jsp" var="board"/>
<c:import url="02_url.jsp" var="url"/>
<c:import url="footer.jsp" var="ff"/>
<table border="1">
  <tr>
    <td>
      ${hh}
    </td>
  </tr>
  <tr>
    <td>
      ${daum}
    </td>
  </tr>
  <tr>
    <td>
      ${ff}
    </td>
  </tr>
</table>
