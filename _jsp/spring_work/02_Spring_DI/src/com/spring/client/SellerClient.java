package com.spring.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.model.product.Computer;
import com.spring.model.product.Seller;
//메서드 Injection
public class SellerClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("seller.xml");
		//pc3참조
		Computer pc3=(Computer)ct.getBean("pc3");
		System.out.println(pc3.getContents()+"\n");
		//실행1
		//---------------------------
		//pc4참조
		Computer pc4=(Computer)ct.getBean("pc4");
		System.out.println(pc4.getContents()+"\n");
		//실행2
		//---------------------------
		//Seller빈 참조
		Seller seller=(Seller)ct.getBean("seller"); //빈 얻기
		seller.sell();
		//실행3
	}//main-end
}//class-end
