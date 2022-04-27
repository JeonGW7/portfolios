package com.spring.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.order.CartService;
public class CartClient {
	public static void main(String[] args) {
		AbstractApplicationContext ct=new ClassPathXmlApplicationContext("cart.xml");
		//실행1
		
		//위의 컨텍스트 종료 후(shutdown hook)을 추가한다
		ct.registerShutdownHook();
		//실행2
	}//main-end
}//class-end
