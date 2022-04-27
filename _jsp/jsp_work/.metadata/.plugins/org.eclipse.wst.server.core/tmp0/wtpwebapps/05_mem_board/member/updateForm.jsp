<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="member.*"
    %>
<%--updateForm--%>
<%
request.setCharacterEncoding("UTF-8");
String id=(String)session.getAttribute("id"); //** id를 세션으로 부터 가져와서
MemberDAO dao=MemberDAO.getDao(); //dao객체 얻기
MemberDTO dto=dao.getMember(id); //dao메서드 호출
%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>updateForm.jsp</title>
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <%--daum API사용--%>
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
		  alert("암호를 입력 하세요");
		  $('#pw').focus();
		  return false;
	  }
	  if($('#pw2').val()==''){
		  alert("암호확인을 입력 하세요");
		  $('#pw2').focus();
		  return false;
	  }
	  if($('#pw').val()!=$('#pw2').val()){
		  alert("암호와 암호확인이 일치하지 않습니다");
		  $('#pw2').val('');
		  $('#pw').val('').focus();
		  return false;
	  }
	  $('#email').val($('#email1').val()+$('#email2').val());
	  $('#tel').val($('#tel1').val()+$('#tel2').val()+$('#tel3').val());
	  return true;
  }
  </script>
  <style type="text/css">
  h2{text-align:center;}
  table{
  margin:auto;
  }
  </style>
</head>
<body>
  <h2>내 정보 수정</h2>
  <form name="updateForm" method="post" action="updatePro.jsp" onSubmit="return check()">
    <table border="1">
      <tr>
        <td>ID</td>
        <td><%=dto.getId()%></td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="20">*필수입력</td>
      </tr>
      <tr>
        <td>암호확인</td>
        <td><input type="password" name="pw2" id="pw2" size="20">*필수입력</td>
      </tr>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" id="name" value="<%=dto.getName()%>"></td>
      </tr>
      <%
      String email=dto.getEmail();
      int index=email.indexOf('@');
      String email1=email.substring(0,index);
      String email2=email.substring(index);
      String email3=email.substring(index+1); //@안보여주기위해서
      %>
      <tr>
        <td>이메일</td>
        <td>
          <input type="text" name="email1" id="email1" value="<%=email1%>">
          @
          <select name="email2" id="email2">
            <option value="<%=email2%>"><%=email3%></option>
            <option value="@naver.com">naver.com</option>
            <option value="@daum.net">daum.net</option>
            <option value="@nate.com">nate.com</option>
          </select>
          <input type="hidden" name="email" id="email">
        </td>
      </tr>
      <%
      String tel=dto.getTel();
      String tel1=tel.substring(0,3);//01012345678
      String tel2=tel.substring(3,7);//01012345678
      String tel3=tel.substring(7);//01012345678
      %>
      <tr>
        <td>전화</td>
        <td>
          <select name="tel1" id="tel1">
            <option value="010">010</option>
            <option value="018">018</option>
            <option value="017">017</option>
          </select>-
          <input type="text" name="tel2" id="tel2" size="4" value="<%=tel2%>">-
          <input type="text" name="tel3" id="tel3" size="4" value="<%=tel3%>">
          <input type="hidden" name="tel" id="tel">
        </td>
      </tr>
      <tr>
        <td>우편번호</td>
        <td>
          <input type="text" name="zipcode" id="zipcode" size="7" value="<%=dto.getZipcode()%>">
          <input type="button" value="주소찾기" onclick="openDaumPostcode()">
        </td>
      </tr>
      <tr>
        <td>주소</td>
        <td><input type="text" name="addr" id="addr" size="50" value="<%=dto.getAddr()%>"></td>
      </tr>
      <tr>
        <td>상세주소</td>
        <td><input type="text" name="addr2" id="addr2" size="20" value="<%=dto.getAddr2() %>"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="내정보수정">
          <input type="button" value="취소" onclick="location='main.jsp'">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>