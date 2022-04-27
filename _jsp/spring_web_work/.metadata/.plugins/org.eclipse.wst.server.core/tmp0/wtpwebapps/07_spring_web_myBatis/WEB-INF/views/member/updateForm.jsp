<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--updateForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <style type="text/css">
  h2{
  text-align: center;
  }
  table{
  margin: auto;
  background-color: ivory;
  width: 60%;
  border: 1px solid black;
  }
  </style>
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  
  <%--daum API사용 --%>
  <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
  
  <script>
   function openDaumPostcode(){
       
      new daum.Postcode({
         oncomplete:function(data){
            document.getElementById('zipcode').value=data.zonecode;
            document.getElementById('addr').value=data.address;
          }
         
      }).open();
   }//openDaumPostcode()---
  </script>
  <script type="text/javascript">
  function check(){
     if($('#pw').val()==''){
         alert("암호는 필수입력 입니다");
         $('#pw').focus();
         return false;
     }
     if($('#pw2').val()==''){
         alert("암호확인 필수입력 입니다");
         $('#pw2').focus();
         return false;
     }
     if($('#pw').val() != $('#pw2').val()){
         alert("암호와 암호확인이 일치하지 않습니다");
         $('#pw2').val("");
         $('#pw').val("").focus();
         return false;
     }
     email=$('#email1').val() + $('#email2').val();
     $('#email').val(email);
     
     tel=$('#tel1').val()+$('#tel2').val()+$('#tel3').val();
     $('#tel').val(tel);
      
     document.updateForm.submit();
  }
  </script>
</html>
<body>
  <h2>내정보 수정</h2>
  <form name="updateForm" method="post" action="memberUpdatePro.do">
    <table>
      <tr>
        <td>이름</td>
        <td>
        <input type="text" name="name" id="name" value="${memberDto.name}" size="20">
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
        <input type="text" name="email1" id="email1" value="${email1}" size="10">
        @
        <select name="email2" id="email2">
          <option value="${email2}">${email3}</option>
          <option value="@naver.com">naver.com</option>
          <option value="@daum.net">daum.net</option>
          <option value="@nate.com">nate.com</option>
        </select>
        <input type="hidden" name="email" id="email">
        </td>
      </tr>
      <tr>
        <td>전화</td>
        <td>
          <input type="text" name="tel1" id="tel1" value="${tel1}" size="4">-
          <input type="text" name="tel2" id="tel2" value="${tel2}" size="4">-
          <input type="text" name="tel3" id="tel3" value="${tel3}" size="4">
          <input type="hidden" name="tel" id="tel">
        </td>
      </tr>
      <tr>
        <td>우편번호</td>
        <td>
          <input type="text" name="zipcode" id="zipcode" size="7" value="${memberDto.zipcode}" readonly>
          <input type="button" value="주소찾기" onClick="openDaumPostcode()">
        </td>
      </tr>
      <tr>
        <td>주소</td>
        <td>
          <input type="text" name="addr" id="addr" value="${memberDto.addr}" size="50" readonly>
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
          <input type="reset" value="취소">
          <a href="list.do">수정안함</a>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>