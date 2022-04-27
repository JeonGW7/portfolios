package ch14_exception;
//FileNotFoundException
public class Test03_exception {
	public static void main(String[] args) {
		try{
			Runtime r = Runtime.getRuntime();//실행파일 정보를 얻어서 
//			r.exec("C:\\Windows\\System32\\calc.exe");//실행파일실행
//			r.exec("C:\\Windows\\System32\\notepad.exe");//실행파일실행
//			r.exec("C:\\Windows\\System32\\winmine.exe");//실행파일실행
			r.exec("C:/Program Files/Google/Chrome/Application/chrome.exe https://www.daum.net");//실행파일실행  /는 유닉스 리눅스 경로  \는 윈도우 경로
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main-end
}//class-end
