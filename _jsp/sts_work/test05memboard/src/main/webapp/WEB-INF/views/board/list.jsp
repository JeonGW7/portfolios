<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<style type="text/css">
table{
margin: auto;
width: 80%;
background-color: ivory;
}
</style>
</head>
<body>
  <h2>글목록(전체글):${count}</h2>
  <table>
    <tr>
      <td align="right">
        <a href="${ctxpath}/board/writeForm.do">글쓰기</a>
      </td>
    </tr>
  </table>
  <c:if test="${count==0}">
    게시판에 저장된 글이 없습니다 
  </c:if>
  <form name="searchForm" method="post" action="${ctxpath}/board/list.do?pageNum=${currentPage}">
    <table>
      <tr>
        <td align="right">
        <select name="keyField">
          <option value="writer">작성자</option>
          <option value="subject">글제목</option>
          <option value="content">글내용</option>
        </select>
        <input type="text" name="keyWord">
        <input type="submit" value="검색">
        </td>
      </tr>
    </table>
  </form>
  <c:if test="${count>0}">
    <table border="1">
      <tr bgcolor="#ffB4B4">
        <th>글번호</th>
        <th>글제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
        <th>IP</th>
      </tr>
      
      <c:forEach var="dto" items="${list}">
        <tr>
          <td>
            <c:out value="${number}"/>
            <c:set var="number" value="${number-1}"/>
          </td>
          
          <%-- 글제목 --%>
          <td>
            <%-- 답글 들여쓰기 --%>
            <c:if test="${dto.re_level>0}">
              <img src="${ctxpath}/resources/imgs/level.gif" width="${5*dto.re_level}" height="16">
              <img src="${ctxpath}/resources/imgs/re.gif">
            </c:if>
            <%-- 원글 --%>
            <c:if test="${dto.re_level==0}">
              <img src="${ctxpath}/resources/imgs/level.gif" width="${5*dto.re_level}" height="16">
            </c:if>
            
            <%-- 제목을 클릭하면 글내용 보기로 가기 --%>
            <a href="${ctxpath}/board/content.do?num=${dto.num}&pageNum=${currentPage}">
              ${dto.subject}
            </a>
            
            <%-- 조회수가 10번 이상이면 hot.gif표시 --%>
            <c:if test="${dto.readcount>=10}">
              <img src="${ctxpath}/resources/imgs/hot.gif" border="0" height="16">
            </c:if>
          </td>
          <td>${dto.writer}</td>
          <td>${dto.regdate}</td>
          <td>${dto.readcount}</td>
          <td>${dto.ip}</td>
        </tr>
      </c:forEach>
    </table>
  </c:if>
  <%--블럭,페이지 처리--%>
  <table>
    <tr>
      <td align="center">
      
        <%-- 에러방지 --%>
        <c:if test="${endPage>pageCount}">
          <c:set var="endPage" value="${pageCount}"/>
        </c:if>
        
        <%-- 이전 블럭 --%>
        <c:if test="${startPage>10}">
          <a href="${ctxpath}/board/list.do?pageNum=${startPage-10}">[이전블럭]</a>
        </c:if>
        
        <%--페이지처리 --%>
        <c:forEach var="i" begin="${startPage}" end="${endPage}">
          <a href="${ctxpath}/board/list.do?pageNum=${i}">[${i}]</a>
        </c:forEach>
        
        <%--다음블럭 처리 --%>
        <c:if test="${endPage<pageCount}">
          <a href="${ctxpath}/board/list.do?pageNum=${startPage+10}">[다음블럭]</a>
        </c:if>
      </td>
    </tr>
  </table>
</body>
</html>