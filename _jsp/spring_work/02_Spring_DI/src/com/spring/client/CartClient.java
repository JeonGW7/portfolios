package com.spring.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.order.CartService;
public class CartClient {
	public static void main(String[] args) {
		AbstractApplicationContext ct=new ClassPathXmlApplicationContext("cart.xml");
		//����1
		
		//���� ���ؽ�Ʈ ���� ��(shutdown hook)�� �߰��Ѵ�
		ct.registerShutdownHook();
		//����2
	}//main-end
}//class-end
