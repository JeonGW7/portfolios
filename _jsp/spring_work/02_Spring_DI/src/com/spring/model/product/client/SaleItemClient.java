package com.spring.model.product.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.model.product.Computer;
import com.spring.model.product.SaleItem;
//Ŭ���̾�Ʈ
public class SaleItemClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("saleItem.xml");
		Computer pc01=(Computer)ct.getBean("pc01"); //����
		System.out.println(pc01.getContents());  //��ü.�޼���
		//����1
		
		//������ DI
		SaleItem saleItem=(SaleItem)ct.getBean("saleItem");
		System.out.println(saleItem.display());
		
		//setter DI
		SaleItem saleItem2=(SaleItem)ct.getBean("saleItem2");
		System.out.println(saleItem2.display());
	}//main-end
}//class-end