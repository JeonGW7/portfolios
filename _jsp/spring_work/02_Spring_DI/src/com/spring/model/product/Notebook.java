package com.spring.model.product;

public class Notebook extends Computer{
	String battery; //���� �߰�
	public Notebook(String name){ //���� �ִ� ������
		super(name); //����Ŭ���� ������ ȣ��
	}
	//battery
	//getter,setter
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	//��Ÿ �޼���, ����� ���� �޼���
	public String getContents(){
		return super.getContents()+"\nbattery:"+battery;
	}//getContents-end
}//class-end
