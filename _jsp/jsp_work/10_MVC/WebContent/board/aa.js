/**
 * aa.js
 */
function check(){
	if($('#writer').va1()==''){
		alert("이름을 입력 하세요");
		$('#writer').focus();
		return false;
	}
	if($('#subject').va1()==''){
		alert("제목을 입력 하세요");
		$('#subject').focus();
		return false;
	}
	if($('#content').val()==''){
		alert("글내용을 입력하세요");
		$('#content').focus();
		return false;
	}
	if($('#pw').val()==''){
		alert("암호를 입력하세요");
		$('#pw').focus();
		return false;
	}
	return true;
}