package com.spring.hello;
//요청받는 클래스는 일하는 클래스 객체를 클라이언트에게 넘겨준다
public class HelloServiceManager {
	public static HelloService getInstance(){
		return new HelloServiceImpl(); //일하는 클래스
		//spring.xml에 빈 등록
	}
}//class-end
