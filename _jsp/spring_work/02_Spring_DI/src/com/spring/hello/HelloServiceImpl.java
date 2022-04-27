package com.spring.hello;
//구현 클래스
public class HelloServiceImpl implements HelloService{
	
	private String name; //전역변수=필드=프로퍼티
	//생성자
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
		System.out.println("hello!!! "+name+"님");
	}//sayHello-end
}//class-end
