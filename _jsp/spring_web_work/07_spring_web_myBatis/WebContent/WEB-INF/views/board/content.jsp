<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--content.jsp--%>
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
</head>
<body>
  <h2>글내용보기</h2>
  <table>
    <tr height="40px">
      <td align="right">
        <a href="editForm.do?num=${boardDto.num}">글수정</a>&nbsp;
        <a href="delete.do?num=${boardDto.num}">글삭제</a>&nbsp;
        <a href="writeForm.do">새글쓰기</a>&nbsp;
        <a href="list.do">리스트</a>&nbsp;
      </td>
    </tr>
  </table>
  <table id="bb">
    <tr>
      <td>글쓴이</td>
      <td>${boardDto.writer}</td>
    </tr>
    <tr>
      <td>글제목</td>
      <td>${boardDto.subject}</td>
    </tr>
    <tr>
      <td>글내용</td>
      <td>
        <textarea rows="10" cols="50" readonly>${boardDto.content}</textarea>
      </td>
    </tr>
  </table>
</body>
</html>