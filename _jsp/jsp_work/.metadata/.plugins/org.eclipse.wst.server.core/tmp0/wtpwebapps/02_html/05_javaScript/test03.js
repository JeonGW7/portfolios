/**
 * 
 */
function check(){
	//데이터 입력 여부 체크
	if(document.myForm.name.value==''){
		alert("이름을 입력하세요");
		document.myForm.name.focus(); //네임객체에 포커스 설정
		return false;
	}
	if(document.myForm.id.value==''){
		alert("ID를 입력하세요");
		document.myForm.id.focus(); //ID객체에 포커스 설정
		return false;
	}
	if(document.myForm.pw.value==''){
		alert("암호를 입력하세요");
		document.myForm.pw.focus(); //pw객체에 포커스 설정
		return false;
	}
	if(document.myForm.pw2.value==''){
		alert("암호확인을 입력하세요");
		document.myForm.pw2.focus(); //pw2객체에 포커스 설정
		return false;
	}
	pw=document.myForm.pw.value;
	pw2=document.myForm.pw2.value;
	
	if(pw != pw2){
		alert("암호와 암호 확인이 다릅니다");
		document.myForm.pw.value='';
		document.myForm.pw2.value='';
		document.myForm.pw.focus();
		return false;
	}
	
	j1=document.myForm.jumin1.value;
	j2=document.myForm.jumin2.value;
	
	if(j1==''){
		alert("주민 앞번호를 입력 하세요");
		 document.myForm.jumin1.focus();
		 return false;
	}
	if(j2==''){
		alert("주민 뒷번호를 입력 하세요");
		 document.myForm.jumin2.focus();
		 return false;
	}
	if(document.myForm.email.value==''){
		alert("이메일을 입력 하세요");
		 document.myForm.email.focus();
		 return false;
	}
	//서버로 전송 해야 하지만 
	//지금은 메시지로 출력
	alert("모든 데이터 체크 완료");
} 









