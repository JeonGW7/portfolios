package ch15_io;
import java.io.*;
//implements Serializable ��ӹ����� ��ü ����ȭ�� �ȴ� 
@SuppressWarnings("serial")
public class Test11_HandPhone implements Serializable{
	//����
	String name; //�ڵ��� �̸�
	int price; //����
	//��ü����ȭ���� ���ܽ��Ѻ��� 
	//transient int price;
	String telecom; //��Ż�
	//������:��ü �ʱ�ȭ
	public Test11_HandPhone(String name,int price,String telecom){
		this.name = name;
		this.price = price;
		this.telecom = telecom;
	}
	//�޼���
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getTelecom() {
		return telecom;
	}
	//�����ϸ� �Ѵ�(�����ϸ� ������ �ȴ�)
}//class-end
