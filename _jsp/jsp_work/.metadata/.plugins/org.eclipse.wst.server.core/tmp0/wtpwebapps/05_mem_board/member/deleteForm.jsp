<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--deleteForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>deleteForm.jsp</title>
  <script>
    function begin(){
    	ff=eval(document.delForm);
    	ff.pw.focus();
    }//begin-end
    function check(){
    	ff=eval(document.delForm);
    	if(ff.pw.value==''){
    		alert("암호를 입력하세요");
    		ff.pw.focus();
    		return false;
    	}
    	answer=confirm("정말로 탈퇴하시겠습니까?")
        if(answer==true) {
        return true;
        } else {
           return false;
        }

    }//check-end
  </script>
  <style type="text/css">
  h2{text-align:center;}
  table{
  margin:auto;
  width: 30%;
  }
  </style>
</head>
<body onload="begin()">
  <h2>회원탈퇴</h2>
  <form name="delForm" method="post" action="deletePro.jsp" onSubmit="return check()">
    <table border="1">
      <tr>
        <td>암호입력</td>
        <td><input type="password" name="pw" id="pw" size="10">*필수입력</td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="회원탈퇴">
          <input type="reset" value="취소" onClick="location='main.jsp'">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>