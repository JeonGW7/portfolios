<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--inputForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>inputForm.jsp</title>
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
  <script>
    function check(){
    	//데이터 입력 여부 체크
    	if($('#id').val()==''){
    		alert("ID를 입력하세요");
    		$('#id').focus();
    		return false;
    	}
		if($('#pw').val()==''){
			alert("암호를 입력하세요");
    		$('#pw').focus();
    		return false;
    	}
		if($('#pw2').val()==''){
			alert("암호확인을 입력하세요");
    		$('#pw2').focus();
    		return false;
    	}
		if($('#pw').val() != $('#pw2').val()){
			alert("암호와 암호확인이 다릅니다");
			$('#pw2').val('');
			$('#pw').val('').focus();
		}
		if($('#name').val()==''){
			alert("이름을 입력하세요");
    		$('#name').focus();
    		return false;
    	}
		if($('#email1').val()==''){
			alert("이메일을 입력하세요");
    		$('#email1').focus();
    		return false;
		}
		if($('#email1').val()!=''){
			email=$('#email1').val()+$('#email2').val();
			//alert(email);
			$('#email').val(email);
		}
		//전화
		if($('#tel2').val()=='' || $('#tel3').val()==''){
			alert("전화번호를 입력하세요");
    		$('#tel2').focus();
    		return false;
    	}
    	tel=$('#tel1').val()+$('#tel2').val()+$('#tel3').val();
    	//alert(tel);
    	$('#tel').val(tel);
    	
		//상세주소
		if($('#addr2').val()==''){
			alert("상세주소를 입력하세요");
    		$('#addr2').focus();
    		return false;
		}
		
		return true;
    }//check-end
    //ajax:ID중복 체크
    function idCheck(){
    	if($('#id').val()==''){
    		alert("ID를 입력하세요");
    		$('#id').focus();
    	}else{
    		$.ajax({
    			type:"POST",
    			url:"confirmID.jsp",
    			data:"id="+$('#id').val(),
    			dataType:'JSON',
    			success:function(data){
    				if(data.x==1){
    					//사용중인 아이디
    					alert("사용중인 ID");
    					$('#id').val('').focus();
    				}else{
    					//사용가능한 아이디
    					alert("사용 가능한 ID");
    					$('#idck').val('true');
    					$('#pw').focus();
    				}
    			}//success-end
    		});
    	}//else-end
    }//idCheck-end
    function aa(){
    	if($('#idck').val()=='false'){
    		alert("ID중복 체크 하세요");
    		$('#id').focus();
    		return false;
    	}
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
  <h2>회원가입</h2>
  <form name="myForm" method="post" action="inputPro.jsp" onSubmit="return check()">
    <table border="1">
      <tr>
        <td>ID</td>
        <td>
        <input type="text" name="id" id="id" size="20">
        <input type="hidden" name="idck" id="idck" value="false">
        <input type="button" value="ID중복체크" onClick="idCheck()">
        </td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="20" onFocus="aa()"></td>
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
        <td>이메일</td>
        <td>
          <input type="text" name="email1" id="email1" size="10">@
          <select name="email2" id="email2">
            <option value="@naver.com">naver.com</option>
            <option value="@nate.com">nate.com</option>
            <option value="@daum.net">daum.net</option>
          </select>
          <input type="hidden" name="email" id="email"/>
        </td>
      </tr>
      <tr>
        <td>전화</td>
        <td>
          <select name="tel1" id="tel1">
            <option value="010">010</option>
            <option value="018">018</option>
            <option value="017">017</option>
          </select>
          -
          <input type="text" name="tel2" id="tel2" size="4">-
          <input type="text" name="tel3" id="tel3" size="4">
          <input type="hidden" name="tel" id="tel">
        </td>
      </tr>
      <tr>
        <td>우편번호</td>
        <td>
        <input type="text" name="zipcode" id="zipcode" size="7">
        <input type="button" value="주소찾기" onClick="openDaumPostcode()">
        </td>
      </tr>
      <tr>
        <td>주소</td>
        <td>
          <input type="text" name="addr" id="addr" size="50" readonly="readonly">
        </td>
      </tr>
      <tr>
        <td>상세주소</td>
        <td><input type="text" name="addr2" id="addr2" size="20"></td>
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