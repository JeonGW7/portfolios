/**
 * 
 */
function isNull(obj,msg){
	if(obj.value==""){
		if(msg){
			alert(msg);
		}//if-end
		obj.focus();
		return true;
	}
}
//----------------
// ID체크
//----------------
function isID(obj){
	var str=obj.value;
	if(str.length==0){
		alert("ID를 입력 하세요");
		return false;
	}//if-end
	str=str.toUpperCase(); //대문자로 변환
	
	//ID 첫글자가 영문자 이어야 한다. 점검
	if(!('A'<=str.charAt(0) && 'Z'>=str.charAt(0))){
		alert("첫글자를 영문자로 입력 하세요");
		return false;
	}
	//2번째부터는 영문자,_,숫자만 사용
	for(var i=1;i<str.length;i++){
		if(!('A'<=str.charAt(i) && 'Z'>=str.charAt(i) || ('0'<=str.charAt(i) && str.charAt(i)<='9') || (str.charAt(i)=='_'))){
			alert("영문자,숫자,특수문자(_)만 사용 가능합니다");
			return false;
		}
	}//for-end
	return true;
}//isID()-end
//----------------
// Email
//----------------
function isEmail(obj){
	var str=obj.value;
	if(str==""){
		return false;
	}
	var i=str.indexOf("@");
	if(i<0){
		return false;
	}
	i=str.indexOf(".");
	if(i<0){
		return false;
	}
	return true;
}//isEmail-end

//---------------------
//card 숫자 16자리 
//---------------------
function isCardNumber(obj){
	var str=obj.value;
	if(str.length != 16){
		alert("16글자가 아닙니다");
		return false;
	}

	for(var i=0; i<str.length; i++){
		if(!('0'<=str.charAt(i) && str.charAt(i)<='9')){
			alert("카드번호는 숫자만 입력 해야 합니다");
			return false;
		}
	}//for-end
	return true;
}//isCardNumber()-end
//----------------
// ssn1,ssn2 주민번호 계산
//----------------
function isSSN(front,back){
	var birthday=front.value; //생년월일
	var num=back.value;
	if(birthday.length != 6){
		return false;
	}
	if(num.length != 7){
		return false;
	}
	var hap=0; //변수
	for(var i=0;i<6;i++){
		var temp=birthday.charAt(i)*(i+2); //23456
		hap+=temp;
	}//for-end
	var n1=num.charAt(0);
	var n2=num.charAt(1);
	var n3=num.charAt(2);
	var n4=num.charAt(3);
	var n5=num.charAt(4);
	var n6=num.charAt(5);
	 
	var n7=num.charAt(6);
	hap += (n1*8)+(n2*9)+(n3*2)+(n4*3)+(n5*4)+(n6*5); //뒷번호 합까지 구한다
	hap %= 11; //11로 나누어 나머지를 구한다
	hap=11-hap; // 11-나머지
	hap=hap%10; //나머지 11%10...1  10%10..0
	if(hap != n7){
		return false;
	}
	return true;
}

//----------------
// p1,p2 암호, 특수문자 2개이상 넣으세요, 연속해서 같은문자 사용하지 마세요
//----------------
function isSame(ob1,ob2){
	var str1=ob1.value;
	var str2=ob2.value;
	if(str1.length==0 || str2.length==0){
		alert("암호를 입력하세요");
		return false;
	}
	if(str1 != str2){
		alert("암호와 암호확인이 다릅니다");
		return false;
	}
	return true;
}



