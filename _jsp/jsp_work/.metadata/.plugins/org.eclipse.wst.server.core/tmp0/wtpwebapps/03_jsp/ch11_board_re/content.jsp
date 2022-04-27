<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    %>
<%--DAO작업을 먼저해야한다 --%>
<%--content.jsp --%>
<%
request.setCharacterEncoding("UTF-8");
//list.jsp에서 보내준값 받기
int num=Integer.parseInt(request.getParameter("num"));
int nowPage=Integer.parseInt(request.getParameter("page"));
String keyField=request.getParameter("keyField");
String keyWord=request.getParameter("keyWord");
BoardDAO dao=new BoardDAO();//객체생성
BoardDTO dto=dao.getBoard(num); //dao메서드 호출,dto를 얻는다
dao.upCount(num);//조회수 증가
String name=dto.getName();
String subject=dto.getSubject();
String content=dto.getContent();
String regdate=dto.getRegdate();
String ip=dto.getIp();
int count=dto.getCount();
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>content.jsp</title>
  <style type="text/css">
  h2{text-align:center;}
  table{margin:auto; width: 70%;}
  </style>
  <script type="text/javascript">
    function list(){
    	document.listForm.action="list.jsp";
    	document.listForm.submit();//전송
    }
  </script>
</head>
<body>
  <h2>글내용보기</h2>
  <table border="1">
    <tr>
      <td>글쓴이</td>
      <td><%=name %></td>
      <td>날짜</td>
      <td><%=regdate %></td>
    </tr>
    <tr>
      <td>글제목</td>
      <td colspan="3"><%=subject %></td>
    </tr>
    <tr>
      <td colspan="4">
      <%
      content=content.replace("\n", "<br>");
      %>
      <%=content%>
      </td>
    </tr>
    <tr>
      <td colspan="4" align="right">
        <%=ip %>로부터 글을 남기셨습니다./조회수:<%=count %>
      </td>
    </tr>
    <tr>
      <td colspan="4" align="right">
        <a href="javaScript:list()">리스트</a>&nbsp;
        <a href="updateForm.jsp?page=<%=nowPage%>&num=<%=num%>">글수정</a>&nbsp;
        <a href="replyForm.jsp?page=<%=nowPage%>&num=<%=num%>">답글쓰기</a>&nbsp;
        <a href="deleteForm.jsp?page=<%=nowPage%>&num=<%=num%>">글삭제</a>&nbsp;
        <a href="writeForm.jsp">새글쓰기</a>&nbsp;
      </td>
    </tr>
  </table>
  <%
  if(keyWord==null || keyWord.equals("")){
	  //전체리스트
	  %>
	  <form name="listForm" method="post">
	    <input type="hidden" name="num" value="<%=num%>">
	    <input type="hidden" name="page" value="<%=nowPage%>">
	  </form>
	  <% 
  }else{
	  //검색
	  %>
	  <form name="listForm" method="post">
	    <input type="hidden" name="num" value="<%=num%>">
	    <input type="hidden" name="page" value="<%=nowPage%>">
	    <input type="hidden" name="keyWord" value="<%=keyWord%>">
	    <input type="hidden" name="keyField" value="<%=keyField%>">
	  </form>
	  <% 
  }//else-end
  %>
</body>
</html>