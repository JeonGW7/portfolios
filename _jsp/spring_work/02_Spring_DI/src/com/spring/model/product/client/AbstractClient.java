package com.spring.model.product.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.model.product.Computer;
import com.spring.model.product.Notebook;

public class AbstractClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("abstract.xml");
		//pc1����
		Computer pc1=(Computer)ct.getBean("pc1");
		System.out.println(pc1.getContents());
		System.out.println(); //line skip
		//����1
		//--------------------------------
		//note1 ������
		Notebook note1=(Notebook)ct.getBean("note1");
		System.out.println(note1.getContents());
		System.out.println(); //line skip
		//--------------------------------
		//pc2 ������
		Computer pc2=(Computer)ct.getBean("pc2");
		System.out.println(pc2.getContents());
		System.out.println(); //line skip
		//--------------------------------
		//note2 �� ����
		Notebook note2=(Notebook)ct.getBean("note2"); //�� ���
		System.out.println(note2.getContents());
		System.out.println();
	}//main-end
}//class-end
