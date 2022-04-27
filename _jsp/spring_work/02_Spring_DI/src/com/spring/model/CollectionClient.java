package com.spring.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Ŭ���̾�Ʈ
public class CollectionClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("collection.xml");
		//listRefBean����
		CollectionBean listRefBean=(CollectionBean)ct.getBean("listRefBean"); //����
		listRefBean.printItemList(); //��ü.�޼���
		System.out.println(); //�ٹٲ�
		//����1
		//--------------------------------
		//setRefBean����
		CollectionBean setRefBean=(CollectionBean)ct.getBean("setRefBean");
		setRefBean.printItemSet(); //��ü.�޼���
		System.out.println(); //�ٹٲ�
		//����2
		//--------------------------------
		// 3.mapRefBean 
		CollectionBean mapRefBean=(CollectionBean)ct.getBean("mapRefBean");
		mapRefBean.printItemMap(); //��ü.�޼���
		System.out.println(); //�ٹٲ�
	}//main-end
}//class-end
