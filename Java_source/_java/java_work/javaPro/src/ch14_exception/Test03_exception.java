package ch14_exception;
//FileNotFoundException
public class Test03_exception {
	public static void main(String[] args) {
		try{
			Runtime r = Runtime.getRuntime();//�������� ������ �� 
//			r.exec("C:\\Windows\\System32\\calc.exe");//�������Ͻ���
//			r.exec("C:\\Windows\\System32\\notepad.exe");//�������Ͻ���
//			r.exec("C:\\Windows\\System32\\winmine.exe");//�������Ͻ���
			r.exec("C:/Program Files/Google/Chrome/Application/chrome.exe https://www.daum.net");//�������Ͻ���  /�� ���н� ������ ���  \�� ������ ���
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main-end
}//class-end
