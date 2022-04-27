package ch18_Thread;
import java.util.*; //Vector ����ϱ� ����
public class Test05_Thread {
	public static void main(String[] args) {
		House house = new House(); //��ü����
		Producer p = new Producer(house); //��ü����
		Consumer c = new Consumer(house); //��ü����
		p.start();//run()ȣ��
		c.start();//run()ȣ��
	}//main-end
}//class-end
//---------------------------
class House extends Thread{
	//����
	@SuppressWarnings("rawtypes")
	Vector vec;
	//������
	@SuppressWarnings("rawtypes")
	public House(){
		vec = new Vector();
	}
	//put()�޼���
	@SuppressWarnings("unchecked")
	synchronized void put(char ch){
		while(vec.size()==3){
			try{
				wait();//���� ������ ���
			}catch(InterruptedException ex){}
		}//while-end
		//��Ⱑ ������ 
		//ó������ 
		vec.add(new Character(ch));//vec�� �ֱ�
		System.out.println("â�� ��ǰ"+ch+"�� ��� ����");
		System.out.println("��ǰ����:"+vec.size());
		notifyAll();//���� �����尡 �۾��� ���� �Ǿ����� ��ο��� �˸���
	}//put-end
	//get()�޼���
	synchronized char get(){
		while(vec.size()==0){//���
			try{
				wait();//���� ������ ������
			}catch(InterruptedException ex){}
		}//while-end
		//��� ������
		//ó������
		Character ch = (Character)vec.remove(0); //vec���� ������ ���� 
		System.out.println("â���� ��ǰ"+ch+"�� ������");
		System.out.println("â�� �ִ� ��ǰ ����:"+vec.size());
		notifyAll();//���� �����尡 �۾��� ����Ǿ����� ��ο��� �˸���
		return ch.charValue();
	}//get-end
}//class-end

//���� Ŭ���� : House�� put()�޼��� ȣ��
class Producer extends Thread{
	//����
	private House house;
	//������
	public Producer(House house){
		this.house = house;
	}
	//run()�������̵�
	public void run(){
		for(char ch='A';ch<='J';ch++){
			System.out.println("�����ڰ� ��ǰ:"+ch+"�� ��������");
			house.put(ch);//�޼��� ȣ��
		}
	}//run-end
}//class-end

//�Һ�Ŭ���� : House�� get()�޼��� ȣ��
class Consumer extends Thread{
	//����
	House house;
	//������
	public Consumer(House house){
		this.house = house;
	}
	//run()�������̵�
	public void run(){
		char ch;//����
		for(int i=1;i<=10;i++){
			ch = house.get();//�޼��� ȣ��
			System.out.println("�Һ��ڰ� ��ǰ "+ch+"�� �Һ� ����");
		}
	}
}



