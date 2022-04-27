<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--memberForm.jsp--%>
<html>
  <head>
    <style type="text/css">
    h2{
    text-align: center;
    }
    table{
    margin: auto;
    border: 1px solid black;
    }
    </style>
    <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
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
  </head>
  <body>
    <h2>회원가입</h2>
    <form method="post" action="">
      <table>
        <tr>
          <td>ID</td>
          <td><input type="text" name="id" size="20" placeholder="id입력"></td>
        </tr>
        <tr>
          <td>패스워드</td>
          <td><input type="password" name="pw" size="20" placeholder="패스워드입력"></td>
        </tr>
        <tr>
          <td>이름</td>
          <td><input type="text" name="name" size="20" placeholder="이름입력"></td>
        </tr>
        <tr>
          <td>전화번호</td>
          <td>
            <select name="tel">
              <option value="010">010</option>
              <option value="018">018</option>
              <option value="017">017</option>
            </select>
            -
            <input type="text" name="tel2" size="4" onKeyUp="if(this.value.length==4) tel3.focus()">
            -
            <input type="text" name="tel3" size="4">
          </td>
        </tr>
        <tr>
          <td>이메일</td>
          <td>
          <input type="text" name="email" size="7">
          @
          <input type="text" name="email2" size="7" placeholder="직접입력">
          <select name="email3">
            <option value="@naver.com">naver.com</option>
            <option value="@daum.net">daum.net</option>
            <option value="@nate.com">nate.com</option>
          </select>
          </td>
        </tr>
        <tr>
          <td>우편번호</td>
          <td>
          <input type="text" name="zipcode" id="zipcode" size="7">
          <input type="button" value="주소찾기" onclick="openDaumPostcode()">
          <button type="button" onclick="openDaumPostcode()"><img src="../../imgs/find.gif" alt="주소찾기"></button>
          </td>
          
        </tr>
        <tr>
          <td>주소</td>
          <td><input type="text" name="addr" id="addr" size="20"></td>
        </tr>
        <tr>
          <td>상세주소</td>
          <td><input type="text" name="addr2" size="20"></td>
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="회원가입">
            <input type="reset" value="취소">
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>