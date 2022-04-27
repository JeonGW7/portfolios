/**
 * aa.js
 */
function updateCheck(){
	if($('#pw').val()==''){
		alert("암호를 입력 하세요");
		$('#pw').focus();
		return false;
	}
	if($('#pw2').val()==''){
		alert("암호확인을 입력하세요");
		$('#pw2').focus();
		return false;
	}
	if($('#pw').val()!=$('#pw2').val()){
		alert("암호와 암호확인이 다릅니다");
		$('#pw2').val(''); //내용삭제
		$('#pw').val('').focus();
		return false;
	}
	return true;
}
function loginCheck(){ //이 경우 크로스브라우저 문제 
	var ff=eval("document.loginForm");
	if(ff.id.value==''){
		alert("ID를 입력하세요");
		ff.id.focus();
		return false;
	}
	if(ff.pw.value==''){
		alert("암호를 입력하세요");
		ff.pw.focus();
		return false;
	}
	return true;
}//loginCheck-end
function check(){
	if($('#id').val()==''){
		alert("id를 입력 하세요");
		$('#id').focus();
		return false;
	}
	if($('#pw').val()==''){
		alert("암호를 입력 하세요");
		$('#pw').focus();
		return false;
	}
	if($('#pw2').val()==''){
		alert("암호확인을 입력하세요");
		$('#pw2').focus();
		return false;
	}
	if($('#pw').val()!=$('#pw2').val()){
		alert("암호와 암호확인이 다릅니다");
		$('#pw2').val(''); //내용삭제
		$('#pw').val('').focus();
		return false;
	}
	if($('#name').val()==''){
		alert("이름을 입력하세요");
		$('#name').focus();
		return false;
	}
	return true;
}
//-----------------------
// Ajax
//-----------------------
function confirmIDcheck(){
	if($('#id').val()==''){
		alert("ID를 입력하세요");
	}else{
		$.ajax({
			type:'POST',
			url:'confirmID.jsp',
			data:"id="+$('#id').val(),
			dataType:'JSON',
			success:function(data){
				//alert(data.x);
				if(data.x==1){
					alert("사용중인 ID");
					$('#id').val('').focus();
				}else{
					alert("사용가능한 ID");
					$('#pw').focus();
				}//else-end
			}//success-end
		});
	}//else-end
}