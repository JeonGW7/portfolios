<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/jspheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateForm.jsp</title>
<style type="text/css">
table {
margin: auto;
background-color: ivory;
width:60%;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<%--daum API사용--%>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

<script>
	function openDaumPostcode() {

		new daum.Postcode({
			oncomplete : function(data) {
				document.getElementById('zipcode').value = data.zonecode;
				document.getElementById('addr').value = data.address;
			}

		}).open();
	}//openDaumPostcode()---
</script>
<script>
function check(){
	if($('#pw').val()==''){
        alert("암호를 입력하세요");
        $('#pw').focus();
        return false;
     }
	
	if($('#pw2').val()==''){
        alert("암호 확인을 입력하세요");
        $('#pw2').focus();
        return false;
     }
     
     if($('#pw2').val()!=$('#pw').val()){
        alert("암호 확인이 일치하지 않습니다");
        $('#pw2').val('');
        $('#pw').val('').focus();
        return false;
     }
     
     //$('#email').val($('#email1').val()+$('#email2').val());
     email=$('#email1').val()+$('#email2').val();
	 $('#email').val(email);
     //$('#tel').val($('#tel1').val()+$('#tel2').val()+$('#tel3').val());
     tel=$('#tel1').val()+$('#tel2').val()+$('#tel3').val();
	 $('#tel').val(tel);
     document.updateForm.submit();
}
</script>
</head>
<body>
  <h2>내정보 수정</h2>
  <form name="updateForm" method="post" action="${ctxpath}/member/memberUpdatePro.do">
    <table border="1">
      <tr>
        <td>이름</td>
        <td>
        <input type="text" name="name" id="name" value="${memberDto.name}">
        <input type="hidden" name="id" value="${memberDto.id}">
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
        <td>이메일</td>
        <td>
        <input type="text" name="email1" id="email1" value="${email1}" size="7">
        @
        <select name="email2" id="email2">
           <option value="${email2}">${email3}</option>
           <option value="@naver.com">naver.com</option>
           <option value="@gmail.com">gmail.com</option>
           <option value="@nate.com">nate.com</option>
           <option value="@daum.net">daum.net</option>
        </select>
        <input type="hidden" name="email" id="email">
        </td>
      </tr>
      
      <tr>
        <td>전화</td>
        <td>
          <input type="text" name="tel1" id="tel1" value="${tel1}" size="4">
          -
          <input type="text" name="tel2" id="tel2" value="${tel2}" size="4">
          -
          <input type="text" name="tel3" id="tel3" value="${tel3}" size="4">
          <input type="hidden" name="tel" id="tel">
        </td>
      <tr>
      
      <tr>
        <td>우편번호</td>
        <td>
          <input type="text" name="zipcode" id="zipcode" value="${memberDto.zipcode}" size="7" readOnly="readonly">
          <input type="button" value="주소찾기" onClick="openDaumPostcode()">
        </td>
      </tr>
      
      <tr>
        <td>주소</td>
        <td>
          <input type="text" name="addr" id="addr" value="${memberDto.addr}" size="50" readOnly="readonly">
        </td>
      </tr>
      
      <tr>
        <td>상세주소</td>
        <td>
          <input type="text" name="addr2" id="addr2" value="${memberDto.addr2}" size="20">
        </td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="내정보수정" onClick="check()">
          <a href="${ctxpath}/member/loginForm.do">수정안함</a>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>