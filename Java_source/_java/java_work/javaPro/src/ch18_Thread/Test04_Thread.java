package ch18_Thread;

public class Test04_Thread {
	public static void main(String[] args) {
		MyThread3 A = new MyThread3("AAA", 1000);
		MyThread3 B = new MyThread3("BBB", 2000);
		MyThread3 C = new MyThread3("CCC", 3000);
		A.start();
		B.start();
		C.start();
	}//main-end
}//class-end
//-----------------------------------------------
class MyThread3 extends Thread{
	//변수
	String msg;//메시지
	long msec;//밀리초
	//생성자
	public MyThread3(String msg,long msec){
		this.msg = msg;
		this.msec = msec;
	}//cons-end
	//run-overriding
	public void run(){
		try{
			while(true){//무한루프
				Thread.sleep(msec);//msec 동안 sleep
				System.out.println(msg);
			}//while-end
		}catch(InterruptedException ex){
			System.out.println(ex);
		}//catch-end
	}//run-end
}//class-end
