package com.spring.model.product;

//�߻�Ŭ����
public abstract class Seller {
	private String name; //����=property
	public abstract Computer getComputer(); //�߻� �޼���
	
	//name ���� getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//����� ���� �޼���
	public void sell(){
		System.out.println(name+" �ǸŻ�ǰ:"+getComputer().getContents());
	}
}//class-end
