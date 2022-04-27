package ch18_Thread;
//우선순위 적용 예제
public class Test02_Thread {
	public static void main(String[] args) {
		MyThread my = new MyThread(); //객체생성
		YouThread you = new YouThread(); //객체생성
		//우선순위적용
		my.setPriority(1);//1:최하위
		you.setPriority(9);//10: 최상위, 9는 2번째 우선순위
		my.start();//run호출
		you.start();//run호출
	}//main-end
}//class-end
//--------------------------------------
class MyThread extends Thread{
	public void run(){
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch);
		}
	}//run-end
}//class-end
//---------------------------------------
class YouThread extends Thread{
	public void run(){
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch);
		}//for-end
	}//run-end
}//class-end
