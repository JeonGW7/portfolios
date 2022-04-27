<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./module/jspheader.jsp" %> 
<%--fileUpload.jsp--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileUpload.jsp</title>
</head>
<body>
<h2>파일업로드 연습</h2>
  <form name="inputForm" method="post" action="${ctxpath}/fileUploadPro.do" enctype="multipart/form-data" accept-charset="UTF-8">
    <table border="1">
      <tr>
        <td>업로드할 파일 선택</td>
        <td><input type="file" name="imgFile" id="imgFile"></td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="파일 업로드">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>