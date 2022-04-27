<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--list.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <script type="text/javascript">
  function searchCheck(){
	  if(document.searchForm.keyWord.value==''){
		  alert("검색어를 입력하세요");
		  document.searchForm.keyWord.focus();
		  return false;
	  }
	  
	  document.searchForm.action="list.do";
	  document.searchForm.submit();
  }
  </script>
</head>
<body bgcolor="#ccdd99">
	<%--검색 --%>
	<form name="searchForm" method="post">
	  <table border="1" width="80%" bgcolor="#ccdd99">
	    <tr>
	      <td align="center" valign="bottom">
	        <select name="keyField">
	          <option value="subject">글제목</option>
	          <option value="writer">이름</option>
	          <option value="content">글내용</option>
	        </select>
	        <input type="text" name="keyWord" size="16">
	        <input type="button" value="검색" onClick="searchCheck()">
	      </td>
	    </tr>
	  </table>
	</form>    
	<table width="80%">
	  <tr>
		  <td align="right">
			<a href="writeForm.do">새글쓰기</a>&nbsp;
			<a href="list.do">리스트처음으로</a>
	      </td>
		</tr>
	</table>
	<table border="1" width="80%" bgcolor="#ccdd99">
		
		<tr>
			<td colspan="4" align="center"><font size="5">게시판 리스트</font></td>
		</tr>
		<tr bgcolor="yellow">
			<th>글쓴이</th>
			<th>글제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="boardDto" items="${list}">
			<tr>
				<td>${boardDto.writer}</td>
				<!-- 글제목을 클릭하면 글내용 보기로 가기 -->
				<td>
				  <a href="content.do?num=${boardDto.num}">
				    ${boardDto.subject}
				  </a>
				</td>
				<td>${boardDto.wdate}</td>
				<td>${boardDto.readcount}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>