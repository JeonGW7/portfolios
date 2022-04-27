package check;

//데이터 유효성 체크
public class FormChecker {
	public static boolean isNull(String m){
		if(m==null || m.trim().length()==0){
			return true; //null이면 
		}
		return false;
	}//isNull-end
	
	//------------------------
	// isNumber 숫자가 아니면
	//------------------------
	public static boolean isNumber(String m){
		if(isNull(m)){
			return false; //입력 하지 않았으면
		}
		m=m.trim(); //공백 제거
		int n=m.length(); //문자열 길이
		for(int i=0;i<n;i++){
			char c=m.charAt(i);
			//0부터 9사이가 아니면, 숫자가 아니면
			if(!('0'<=c && '9'>=c)){
				return false;
			}//if-end
		}//for-end
		return true;
	}//isNumber-end
	//------------------------
	// ID체크
	//------------------------
	public static boolean isID(String m){
		if(isNull(m)){
			return false; //입력하지 않았으면
		}
		m=m.trim(); //공백제거
		m=m.toUpperCase(); //대문자로 변환
		char c=m.charAt(0); //첫글자가 영문자인지 체크
		if(!('A'<=c && 'Z'>=c)){
			return false;
		}//if-end
		
		//2번째 글자부터 영문자,숫자,_만 사용하는 것을 체크
		for(int i=1;i<m.length();i++){
			c=m.charAt(i);
			if(!(('A'<=c && 'Z'>=c) || ('0'<=c && c<='9') || (c=='_'))){
				return false;
			}
		}//for-end
		return true;
	}//isID-end
	
	//------------------------
	// 이메일
	//------------------------
	public static boolean isEmail(String m){
		if(isNull(m)){
			return false; //입력하지 않았으면
		}
		int n=m.indexOf("@");
		if(n<0){
			return false;
		}
		n=m.indexOf(".");
		if(n<0){
			return false;
		}
		return true;
	}//isEmail-end
	//------------------------
	// 카드번호
	//------------------------
	public static boolean isCardNumber(String m){
		if(isNull(m)){
			return false; //입력하지 않았으면
		}
		m=m.trim(); //공백제거
		if(m.length()!=16){
			return false;
		}
		if(isNumber(m)){ //m이 숫자 이면
			return true;
		}
		return false;
	}//isCardNumber-end
	//------------------------
	// 주민번호
	//------------------------
	public static boolean isSSN(String s1,String s2){
		if(isNull(s1) || isNull(s2)){
			return false; //입력하지 않았으면
		}
		if(!isNumber(s1) || !isNumber(s2)){
			return false; //숫자가 아니면 
		}
		s1=s1.trim(); //공백제거 
		s2=s2.trim(); 
		
		if(s1.length() != 6){
			return false;
		}
		if(s2.length() != 7){
			return false;
		}
		int hap=0;
		for(int i=0;i<6;i++){
			hap += (s1.charAt(i)-'0')*(i+2);
		}//for-end
		int n0=s2.charAt(0)-'0';
		int n1=s2.charAt(1)-'0';
		int n2=s2.charAt(2)-'0';
		int n3=s2.charAt(3)-'0';
		int n4=s2.charAt(4)-'0';
		int n5=s2.charAt(5)-'0';
		int n6=s2.charAt(6)-'0';
		
		hap+=(n0*8)+(n1*9)+(n2*2)+(n3*3)+(n4*4)+(n5*5);
		int na=hap%11; //나머지 구한다
		int nn=11-na; //11-나머지 : 11%10 10%10
		int nnn=nn%10; //마지막 끝자리 구하기
		if(n6 != nnn){ //끝자리 비교
			return false;
		}
		return true;
	}//isSSN-end
	
	//------------------------
	// 암호체크
	//------------------------
	public static boolean isSame(String m,String n){
		if(isNull(m) || isNull(n)){
			return false; //입력하지 않았으면
		}
		m=m.trim();
		n=n.trim(); 
		if(m.equals(n)){
			return true; //암호와 암호확인이 같으면
		}
		return false;
	}//isSame-end
}//class-end
