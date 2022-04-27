package ch15_io;
import java.io.*;
public class Test12 {
	public static void main(String[] args) throws Exception {
		Test11_HandPhone phone = new Test11_HandPhone("�ø�3", 1500000, "SKT");
		//���� �۾�
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		oos.writeObject(phone);//���Ϸ� ���� �۾�
		oos.close();
		
		//�о���� �۾�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		Test11_HandPhone phone2 = (Test11_HandPhone)ois.readObject();
		System.out.println("�ڵ��� �̸�:"+phone2.getName());
		System.out.println("�ڵ��� ����:"+phone2.getPrice());
		System.out.println("��Ż�:"+phone2.getTelecom());
		ois.close(); //�ݵ�� close()�ؾ��Ѵ� 
	}//main-end
}//class-end
