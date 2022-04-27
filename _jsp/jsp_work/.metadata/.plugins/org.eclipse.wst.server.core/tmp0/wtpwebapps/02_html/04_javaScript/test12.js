/**
 * test12.js
 */
function check(){
	if(document.myForm.id.value==''){
		alert("id를 입력하세요");
		document.myForm.id.focus();
		return false;
	}
	if(document.myForm.pw.value==''){
		alert("암호를 입력하세요");
		document.myForm.pw.focus();
		return false;
	}
	if(document.myForm.name.value==''){
		alert("이름을 입력하세요");
		document.myForm.name.focus();
		return false;
	}
	//모두 정상적으로 입력되었을 때 
	id=document.myForm.id.value;
	pw=document.myForm.pw.value;
	name=document.myForm.name.value;
	alert("id:"+id+"\n암호:"+pw+"\n이름:"+name);
}