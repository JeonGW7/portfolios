package ch18_Thread;
//sleep(밀리초)사용
//1초 : 1000밀리초
public class Test03_Thread {
	public static void main(String[] args) {
		MyThread2 my2 = new MyThread2();
		my2.start();
	}//main-end
}//class-end
//-------------------
class MyThread2 extends Thread{
	int i = 0; //변수
	//run()오버라이딩
	public void run(){ 
		//sleep()은 예외처리를 해야한다
		try{
			while(i<5){
				i++;
				Thread.sleep(2000);//2초동안 쉬어가면서 실행
				System.out.println("안녕!!");
			}//while-end
		}catch(InterruptedException ex){
			System.out.println(ex);
		}
	}//run-end
}//class-end