package com.spring.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//클라이언트
public class CollectionClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("collection.xml");
		//listRefBean참조
		CollectionBean listRefBean=(CollectionBean)ct.getBean("listRefBean"); //빈얻기
		listRefBean.printItemList(); //객체.메서드
		System.out.println(); //줄바꿈
		//실행1
		//--------------------------------
		//setRefBean참조
		CollectionBean setRefBean=(CollectionBean)ct.getBean("setRefBean");
		setRefBean.printItemSet(); //객체.메서드
		System.out.println(); //줄바꿈
		//실행2
		//--------------------------------
		// 3.mapRefBean 
		CollectionBean mapRefBean=(CollectionBean)ct.getBean("mapRefBean");
		mapRefBean.printItemMap(); //객체.메서드
		System.out.println(); //줄바꿈
	}//main-end
}//class-end
