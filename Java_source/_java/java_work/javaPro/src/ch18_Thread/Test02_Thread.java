package ch18_Thread;
//�켱���� ���� ����
public class Test02_Thread {
	public static void main(String[] args) {
		MyThread my = new MyThread(); //��ü����
		YouThread you = new YouThread(); //��ü����
		//�켱��������
		my.setPriority(1);//1:������
		you.setPriority(9);//10: �ֻ���, 9�� 2��° �켱����
		my.start();//runȣ��
		you.start();//runȣ��
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
