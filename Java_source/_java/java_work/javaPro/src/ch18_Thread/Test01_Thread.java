package ch18_Thread;

public class Test01_Thread {
	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		go.start();//run()호출
		come.start();//run()호출
	}//main-end
}//class-end
//-------------------------
//Thread상속받고, run()오버라이딩 한다 
class Go extends Thread{
	//오버라이딩
	public void run(){ 
		int i = 1;
		while(i<=30){
			System.out.print("Go ");
			i++;
		}//while-end
	}//run-end
}//Go-end
//Thread상속받고, run()오버라이딩 한다 
class Come extends Thread{
	//오버라이딩
	public void run(){
		int i =1;
		while(i<=30){
			System.out.print("Come ");
			i++;
		}//while-end
	}//run-end
}//come-end