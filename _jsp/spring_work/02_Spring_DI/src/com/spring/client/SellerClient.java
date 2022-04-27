package com.spring.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.model.product.Computer;
import com.spring.model.product.Seller;
//�޼��� Injection
public class SellerClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("seller.xml");
		//pc3����
		Computer pc3=(Computer)ct.getBean("pc3");
		System.out.println(pc3.getContents()+"\n");
		//����1
		//---------------------------
		//pc4����
		Computer pc4=(Computer)ct.getBean("pc4");
		System.out.println(pc4.getContents()+"\n");
		//����2
		//---------------------------
		//Seller�� ����
		Seller seller=(Seller)ct.getBean("seller"); //�� ���
		seller.sell();
		//����3
	}//main-end
}//class-end
