<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateForm.jsp</title>
</head>
<body>

  <center><h2> 게시글 수정 </h2></center>
  
  
  <form action="/updatePro" method="post">
    <table width="70%" border="1" align="center">
      <tr>
        <td colspan="2" align="right">
        <button onclick="location.href='/insertForm'">글쓰기</button>
        </td>
     </tr>
      
     <tr>
       <td>글제목</td>
       <td>
        <input type="text" name="subject" value="${boardVO.subject}">
        <input type="hidden" name="writer" value="${boardVO.writer}">
        <input type="hidden" name="bno" value="${boardVO.bno}">
       </td>
     </tr>
     
     <tr>
       <td>글내용</td>
       <td>
        <textarea rows="10" cols="50" name="content">${boardVO.content}</textarea>
       
       </td>
     </tr>
     
     <tr>
       <td colspan="2" align="center">
          <input type="submit" value="글수정">
        <button onclick="location.href='/list'">글목록</button>
       </td>
        
     </tr>
      
    </table>
  </form>
</body>