package com.spring.hello;
//���� Ŭ����
public class HelloServiceImpl implements HelloService{
	
	private String name; //��������=�ʵ�=������Ƽ
	//������
	public HelloServiceImpl(){}
	
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		System.out.println("hello!!! "+name+"��");
	}//sayHello-end
}//class-end
