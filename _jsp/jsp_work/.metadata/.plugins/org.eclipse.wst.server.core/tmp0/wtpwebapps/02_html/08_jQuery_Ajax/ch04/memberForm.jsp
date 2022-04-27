<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--memberForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
   function check(){
	   //데이터 입력여부체크
   }//check-end
   function  idcheck(){
	   //id 중복여부체크
	   //ajax로 한다
	   if($('#id').val()==''){
		   alert("ID를 입력하세요");
	   }else{
		   $.ajax({
			   type:"post",/*메서드 방식*/
			   url:"confirmID.jsp",/*서버주소*/
			   data:"id="+$('#id').val(),/*서버로 넘길 매개변수 값*/
			   dataType:'JSON',/*서버가 보내준 자료 타입*/
			   success:function(data){//data에서 서버가 보내준 내용
				   if(data.x==1){
					   alert("사용중인 id");
					   $('#id').val('').focus();
				   }else{
					   alert("사용 가능한 id");
					   $('#pw').focus();
				   }
			   }//success-end
		   });
	   }//else-end
   }//idcheck-end
  </script>
</head>
<body>
  <h2>회원가입</h2>
  <form name="myForm" method="post" action="">
    <table border="1">
      <tr>
        <td>ID</td>
        <td>
          <input type="text" name="id" id="id" size="20">
          <input type="button" value="ID중복체크" id="btn" onclick="idcheck()">
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="20"></td>
      </tr>
      <tr>
        <td>암호확인</td>
        <td><input type="password" name="pw2" id="pw2" size="20"></td>
      </tr>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" id="name" size="20"></td>        
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="회원가입" onClick="check()">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>