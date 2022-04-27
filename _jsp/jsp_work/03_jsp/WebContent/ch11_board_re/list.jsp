<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="boardre.*"
    import="java.util.*"
    %>
<%--list.jsp --%>
<%
request.setCharacterEncoding("UTF-8");
int nowPage=0; //현재페이지
int nowBlock=0; //현재블럭
int totalRecord=0; //전체 글 갯수
int numPerPage=10; //페이지당 글갯수
int totalPage=0;  //전체페이지수
int totalBlock=0; //전체블럭수
int pagePerBlock=10; //블럭당 페이지수
int beginPerPage=0; //시작 페이지(페이지 시작)
String keyField=""; //키필드 name,subject,content
String keyWord="";  //검색단어
Vector <BoardDTO> vec=null;
%>
<%
//검색
if(request.getParameter("keyWord")!=null){
	keyWord=request.getParameter("keyWord");
	keyField=request.getParameter("keyField");
}
//전체 리스트
if(request.getParameter("reload")!=null){
	if(request.getParameter("reload").equals("true")){
		keyWord="";
		keyField="";
	}
}
%>

<%
java.util.Date date=new java.util.Date();
boardre.BoardDAO dao=new boardre.BoardDAO(); //객체생성
vec=dao.getList(keyField,keyWord); //dao메서드 호출
totalRecord=vec.size(); //총 글 갯수
if(request.getParameter("page")!=null){
	nowPage=Integer.parseInt(request.getParameter("page"));
}
beginPerPage=nowPage*numPerPage; //시작 페이지 계산
// 0*10 = 0  해당페이지의 시작 0~9
// 1*10 = 10			10~19
// 2*10 = 20			20~29
// 3*10 = 30			30~39
// 4*10 = 40			40~49
totalPage=(int)(Math.ceil((double)totalRecord/numPerPage));
// ex)글이 37 : 페이지4까지 나와야함 
if(request.getParameter("nowBlock")!=null){
	nowBlock=Integer.parseInt(request.getParameter("nowBlock")); //현재 클릭한 블럭을 받는다
}
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>list.jsp</title>
  <style type="text/css">
  h2{text-align: center;}
  table{margin: auto;}
  table.wid{width:60%;}
  </style>
  <script>
    function check(){
    	if(document.searchForm.keyWord.value==''){
    		alert("검색어를 입력하세요");
    		document.searchForm.keyWord.focus();
    		return false;
    	}
    	document.searchForm.submit();
    }//check()-end========================
    function list(){
    	document.listForm.action="list.jsp";
    	document.listForm.submit();
    }//list()-end=========================
    //글내용 보기
    function read(number){
    	document.readForm.action="content.jsp";
    	document.readForm.num.value=number;
    	document.readForm.submit();
    }//read()-end=========================
  </script>
</head>
<body bgcolor="ivory">
  <h2>게시판리스트</h2>
  <table>
    <tr>
      <td align="center">
      Total:<%=totalRecord %>Articles&nbsp;(<font color="blue"><%=nowPage+1 %>/<%=totalPage %></font>)
      </td>
      <td align="right">
        <a href="writeForm.jsp">새글쓰기</a>
      </td>
    </tr>
  </table>
  <table border="1" class="wid">
    <tr>
      <td>
      <%
      if(vec.isEmpty()){
    	  out.println("등록된 글이 없습니다");
      }else{//등록된 글이 있을때
    	  %>
    	  <table border="1" width="100%">
    	    <tr bgcolor="cyan" height="120%">
    	      <th>글번호</th>
    	      <th>글제목</th>
    	      <th>글쓴이</th>
    	      <th>날짜</th>
    	      <th>조회수</th>
    	    </tr>
    	    <%
    	    for(int i=beginPerPage;i<(beginPerPage+numPerPage);i++){
    	    	if(i==totalRecord){
    	    		break; //for탈출
    	    	}
    	    	BoardDTO dto=(BoardDTO)vec.get(i);
    	    	String name=dto.getName();
    	    	String subject=dto.getSubject();
    	    	String regdate=dto.getRegdate();
    	    	int depth=dto.getDepth();
    	    	int num=dto.getNum();
    	    	int count=dto.getCount(); //조회수 
    	    	%>
    	    	<tr>
    	    	  <%--글번호는 역순으로 출력 --%>
    	    	  <td align="center"><%=totalRecord-i %></td>
    	    	  <%--글제목을 클릭하면 글내용보기로 간다 --%>
    	    	  <td>
    	    	  <%
    	    	  if(depth>0){ //답글이면 
    	    		 for(int re=0;re<depth;re++){
    	    			 out.println("&nbsp;&nbsp;");//들여쓰기
    	    		 }
    	    	  }
    	    	  %>
    	    	  <a href="javaScript:read('<%=num%>')"><%=subject %></a>
    	    	  </td>
    	    	  <td><%=name %></td>
    	    	  <td><%=regdate %></td>
    	    	  <td><%=count %></td>
    	    	</tr>
    	    	<%
    	    }//for-end
    	    %>
    	  </table>
    	  <% 
      }//else-end-글이 있으면
      //블럭처리
      //페이지처리
      //검색
      %>
      </td>
    </tr>
    <tr>
      <td align="right">
         <a href="writeForm.jsp">[글쓰기]</a>
         <a href="javaScript:list()">[리스트처음으로]</a>
       </td>
    </tr>
    <tr>
       <%--블럭처리 --%>
       <td align="left">Go to Page
       <%
       if(totalRecord != 0){ //글이 존재하면
    	   if(nowBlock>0){ //이전블럭
    		   int page1=((nowBlock-1)*pagePerBlock+9);
    		   %>
    		   <a href="list.jsp?nowBlock=<%=nowBlock-1%>&page=<%=page1%>&keyField=<%=keyField%>&keyWord=<%=keyWord%>">[이전블럭]</a>
    		   <% 
    	   }//이전블럭-end
    	   //페이지 처리
    	   for(int i=0;i<pagePerBlock;i++){
    		   %>
    		   <a href="list.jsp?nowBlock=<%=nowBlock%>&page=<%=(nowBlock*pagePerBlock)+i%>">[<%=(nowBlock*pagePerBlock)+i+1%>]</a>
    		   <% 
    		   if(((nowBlock*pagePerBlock)+i+1)==totalPage){break;} //for탈출
    	   }//페이지 처리-end
    	   //다음블럭
    	   if(totalBlock>nowBlock){
    		   %>
    		   <a href="list.jsp?nowBlock=<%=nowBlock+1%>&page=<%=(nowBlock+1)*pagePerBlock%>&keyField=<%=keyField%>&keyWord=<%=keyWord%>">
    		   [다음블럭]
    		   </a>
    		   <% 
    	   }//다음블럭-end
       }//글이 존재하면-end
       %>
       </td>
       </tr>
       <tr>
    </tr>
  </table>
  <%--글검색 searchForm--%>
  <form name="searchForm" method="post" action="list.jsp">
    <table border="1">
      <tr>
        <td align="center" valign="bottom">
          <select name="keyField">
            <option value="subject">제목</option>
            <option value="name">이름</option>
            <option value="content">글내용</option>
          </select>
          <input type="text" name="keyWord" size="16">
          <input type="hidden" name="page" value="0">
          <input type="button" value="검색" onclick="check()">
        </td>
      </tr>
    </table>
  </form>
  <%--listForm --%>
  <form name="listForm" method="post">
    <input type="hidden" name="reload" value="true">
    <input type="hidden" name="page" value="0">
    <input type="hidden" name="nowBlock" value="0">
  </form>
  <%--readForm 글내용 보기 --%>
  <form name="readForm" method="post">
    <input type="hidden" name="num" value=""><%--javaScript함수에서 넣는다 --%>
    <input type="hidden" name="page" value="<%=nowPage%>">
    <input type="hidden" name="keyField" value="<%=keyField %>">
    <input type="hidden" name="keyWord" value="<%=keyWord %>">
  </form>
</body>
</html>








