package com.spring.model.product;

public class Notebook extends Computer{
	String battery; //변수 추가
	public Notebook(String name){ //인자 있는 생성자
		super(name); //상위클래스 생성자 호출
	}
	//battery
	//getter,setter
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	//기타 메서드, 사용자 정의 메서드
	public String getContents(){
		return super.getContents()+"\nbattery:"+battery;
	}//getContents-end
}//class-end
