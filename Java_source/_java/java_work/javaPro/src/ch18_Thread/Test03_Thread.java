package ch18_Thread;
//sleep(�и���)���
//1�� : 1000�и���
public class Test03_Thread {
	public static void main(String[] args) {
		MyThread2 my2 = new MyThread2();
		my2.start();
	}//main-end
}//class-end
//-------------------
class MyThread2 extends Thread{
	int i = 0; //����
	//run()�������̵�
	public void run(){ 
		//sleep()�� ����ó���� �ؾ��Ѵ�
		try{
			while(i<5){
				i++;
				Thread.sleep(2000);//2�ʵ��� ����鼭 ����
				System.out.println("�ȳ�!!");
			}//while-end
		}catch(InterruptedException ex){
			System.out.println(ex);
		}
	}//run-end
}//class-end