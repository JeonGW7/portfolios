package ch18_Thread;

public class Test01_Thread {
	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		go.start();//run()ȣ��
		come.start();//run()ȣ��
	}//main-end
}//class-end
//-------------------------
//Thread��ӹް�, run()�������̵� �Ѵ� 
class Go extends Thread{
	//�������̵�
	public void run(){ 
		int i = 1;
		while(i<=30){
			System.out.print("Go ");
			i++;
		}//while-end
	}//run-end
}//Go-end
//Thread��ӹް�, run()�������̵� �Ѵ� 
class Come extends Thread{
	//�������̵�
	public void run(){
		int i =1;
		while(i<=30){
			System.out.print("Come ");
			i++;
		}//while-end
	}//run-end
}//come-end