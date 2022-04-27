<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--editForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <style type="text/css">
    body{background-color: ivory;}
    table{
    margin: auto;
    width:80%;
    line-height: 40px;
    }
    #bb{
    border:1px solid black;
    background-color: cyan;
    }
    h2{
    text-align: center;
    }
  </style>
  
  <script type="text/javascript">
    function check(){
    	if(document.editForm.pw.value==''){
    		alert("암호는 필수 입력 입니다");
    		document.editForm.pw.focus();
    		return false;
    	}
    	if(document.editForm.pw.value!='${boardDto.pw}'){
    		alert("암호가 틀립니다");
    		document.editForm.pw.focus();
    		return false;
    	}
    	document.editForm.submit();
    }
  </script>
</head>
<body>
  <h2>글 수정 폼</h2>
  <form name="editForm" method="post" action="editPro.do">
    <table>
      <tr>
        <td>글쓴이</td>
        <td>
          <input type="text" name="writer" value="${boardDto.writer}" size="20">
          <input type="hidden" name="num" value="${boardDto.num}">
        </td>
      </tr>
      <tr>
        <td>글제목</td>
        <td><input type="text" name="subject" value="${boardDto.subject}" size="50"></td>
      </tr>
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="content" rows="10" cols="50">${boardDto.content}</textarea>
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" size="20"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="글수정" onClick="check()">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>