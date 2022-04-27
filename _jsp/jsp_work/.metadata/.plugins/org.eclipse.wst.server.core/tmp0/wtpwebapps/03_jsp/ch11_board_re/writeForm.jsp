<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--writeForm.jsp --%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>writeForm.jsp</title>
  <style type="text/css">
  h2{text-align: center;}
  table{margin:auto; width:60%;}
  </style>
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript">
  function check(){//데이터 입력여부 체크
	  if($('#name').val()==''){
		  alert("이름을 입력 하세요");
		  $('#name').focus();
		  return false;
	  }
	  if($('#subject').val()==''){
		  alert("글제목을 입력 하세요");
		  $('#subject').focus();
		  return false;
	  }
	  if($('#content').val()==''){
		  alert("글내용을 입력 하세요");
		  $('#content').focus();
		  return false;
	  }
	  if($('#pw').val()==''){
		  alert("암호를 입력 하세요");
		  $('#pw').focus();
		  return false;
	  }
	  return true;
  }
  </script>
</head>
<body>
 <h2>게시판글쓰기</h2>
 <table>
   <tr>
     <td align="right">
       <a href="list.jsp?page=1">리스트</a>
     </td>
   </tr>
 </table>
 <form name="myForm" method="post" action="writePro.jsp" onSubmit="return check()">
   <table border="1">
     <tr>
       <td>이름</td>
       <td><input type="text" name="name" id="name" size="20"></td>
     </tr>
     <tr>
       <td>글제목</td>
       <td><input type="text" name="subject" id="subject" size="20"></td>
     </tr>
     <tr>
       <td>글내용</td>
       <td>
       <textarea name="content" id="content" rows="10" cols="50"></textarea>
       </td>
     </tr>
     <tr>
       <td>암호</td>
       <td><input type="password" name="pw" id="pw" size="20"></td>
     </tr>
     <tr>
       <td colspan="2" align="center">
         <input type="submit" value="글쓰기">
         <input type="reset" value="취소">
       </td>
     </tr>
   </table>
 </form>
</body>
</html>