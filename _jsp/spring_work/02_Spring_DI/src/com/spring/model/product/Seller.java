package com.spring.model.product;

//추상클래스
public abstract class Seller {
	private String name; //변수=property
	public abstract Computer getComputer(); //추상 메서드
	
	//name 변수 getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//사용자 정의 메서드
	public void sell(){
		System.out.println(name+" 판매상품:"+getComputer().getContents());
	}
}//class-end
