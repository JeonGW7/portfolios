<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardoracle.*"
    import="java.util.*"
    import="java.text.SimpleDateFormat"
    %>
<%--list.jsp--%>    
<%
request.setCharacterEncoding("UTF-8");
%>
<%!
int pageSize=10;
SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //연월일 시분초
%>
<%
String pageNum=request.getParameter("pageNum"); //현재 페이지 받기
if(pageNum==null){
	pageNum="1";
}
int currentPage=Integer.parseInt(pageNum);
int startRow=(currentPage-1)*pageSize+1; //페이지의 시작 글번호 
//				(1-1)*10+1 = 1 
//				(2-1)*10+1 = 11 
//				(3-1)*10+1 = 21 
int endRow=currentPage*pageSize; //페이지의 끝 글번호 
//   1*10 = 10 
//   2*10 = 20 
//   3*10 = 30
int count=0; //글 갯수 넣을 변수
int number=0; //글번호
List<BoardDTO> list=null; //back-end에서 보내준 데이터 받기
BoardDAO dao=BoardDAO.getDao(); //dao객체얻기
count=dao.getCount(); //글갯수얻기
if(count>0){ //글이 존재하면
	list=dao.getList(startRow, pageSize); //dao메서드 호출 list를 받는다
}
number=count-(currentPage-1)*pageSize; //보여줄 글번호 
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>list.jsp</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
  <h2>글목록(전체글:<%=count%>)</h2>
  <table>
    <tr>
      <td align="right">
        <a href="writeForm.jsp">새글쓰기</a>
      </td>
    </tr>
  </table>
  <%
  if(count==0){
	  out.println("<h2>게시판에 저장된 글이 없습니다</h2>");
  }else{ //글이 존재하면
	  %>
	  <table border="1">
	    <tr bgcolor="ivory">
	      <td>번호</td>
	      <td>글제목</td>
	      <td>작성자</td>
	      <td>작성일</td>
	      <td>조회수</td>
	      <td>IP</td>
	    </tr>
	    <%
	    for(int i=0;i<list.size();i++){
	    	BoardDTO dto=(BoardDTO)list.get(i);
	    	%>
	    	<tr>
	    	  <td><%=number--%></td>
	    	  <td>
	    	  <%
	    	  int wid=0; //변수
	    	  if(dto.getRe_level()>0){
	    		  //답글이면 들여쓰기
	    		  wid=5*(dto.getRe_level());
	    		  %>
	    		  <img src="../imgs/level.gif" width="<%=wid%>" height="16">
	    		  <img src="../imgs/re.gif">
	    		  <%
	    	  }else{ //원글일때
	    		  %>
	    		  <img src="../imgs/level.gif" width="<%=wid%>" height="16">
	    		  <%
	    	  }//else-end
	    	  %>
	    	  <%--글제목을 클릭하면 content.jsp로간다 --%>
	    	  <a href="content.jsp?num=<%=dto.getNum()%>&pageNum=<%=currentPage%>">
	    	  <%=dto.getSubject() %>
	    	  </a>
	    	  <%--조회수가 10번이상이면 hot.gif표시 --%>
	    	  <%
	    	  if(dto.getReadcount()>=10){
	    		  %>
	    		  <img src="../imgs/hot.gif">
	    		  <%
	    	  }
	    	  %>
	    	  </td>
	    	  <td width="80"><%=dto.getWriter()%></td>
	    	  <td><%=dto.getRegdate() %></td>
	    	  <td width="45"><%=dto.getReadcount() %></td>
	    	  <td><%=dto.getIp() %></td>
	    	</tr>
	    	<%
	    }//for-end
	    %>
	  </table>
	  <%
  }//else-end
  %>
  <%--블럭처리,페이지 처리 --%>
  <%
  if(count>0){
	  %>
	  <table border="1">
	    <tr>
	      <td align="center">
	       <%
	       //전체 페이지 수 구하기
	       int pageCount=count/pageSize+(count%pageSize==0?0:1);
	       //int pageCount=(int)(Math.ceil());
	       int pageBlock=10; //블럭당 페이지수
	       int startPage=(int)(currentPage/pageBlock)*10+1; //시작페이지
	       //					   (1/10)*10+1 = 1 
	       //					   (5/10)*10+1 = 1 
	       //					   (9/10)*10+1 = 1 
	       //					   (10/10)*10+1 = 11
	       //					   (19/10)*10+1 = 11
	       //					   (20/10)*10+1 = 21
	       //					   (29/10)*10+1 = 21
	       int endPage=startPage+pageBlock-1;
	       //			     1+10-1=10
	       //			     11+10-1=20
	       //			     21+10-1=30
	       if(endPage>pageCount){ //에러방지
	    	   endPage=pageCount;
	       }
	       //이전블럭
	       if(startPage>10){
	    	   %>
	    	   <a href="list.jsp?pageNum=<%=startPage-10%>">[이전블럭]</a>
	    	   <%
	       }//if-end
	       //페이지처리
	       for(int i=startPage;i<=endPage;i++){
	    	   %>
	    	   <a href="list.jsp?pageNum=<%=i%>">[<%=i%>]</a>
	    	   <%
	       }//for-end
	       //다음 블럭
	       if(endPage<pageCount){
	    	   %>
	    	   <a href="list.jsp?pageNum=<%=startPage+10%>">[다음블럭]</a>
	    	   <%
	       }//if-end
	       %>
	      </td>
	    </tr>
	  </table>
	  <%
  }//if-end //글이존재하면
  %>
</body>
</html>