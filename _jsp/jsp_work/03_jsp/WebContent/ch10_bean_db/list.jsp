<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"
    import="java.util.*"
    %>
<%--list.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
BoardDAO dao=new BoardDAO(); //객체생성
List<BoardDTO> list=dao.getList(); //dao메서드 호출
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto; width: 60%}
  </style>
</head>
<body>
  <h2>게시판 리스트</h2>
  <table>
  <tr>
    <td align="right">
      <a href="writeForm.jsp">글쓰기</a>
    </td>
  </tr>
  </table>
  <table border="1">
    <tr>
      <th>번호</th>
      <th>글제목</th>
      <th>작성자</th>
      <th>작성일</th>
      <th>조회수</th>
    </tr>
    <%
    for(int i=0;i<list.size();i++){
    	BoardDTO dto=(BoardDTO)list.get(i);
    	%>
    	<tr>
    	  <td><%=dto.getNum() %></td>
    	  <%--글제목을 클릭하면 글내용 보기로 가게한다 --%>
    	  <td>
    	  <a href="content.jsp?num=<%=dto.getNum()%>"><%=dto.getSubject() %></a>
  		  </td>
    	  <td><%=dto.getWriter() %></td>
    	  <td><%=dto.getWdate() %></td>
    	  <td><%=dto.getReadcount() %></td>
    	  <td>
    	    <a href="deletePro.jsp?num=<%=dto.getNum()%>">삭제</a>
    	  </td>
    	</tr>
    	<% 
    }//for-end
    %>
  </table>
</body>
</html>