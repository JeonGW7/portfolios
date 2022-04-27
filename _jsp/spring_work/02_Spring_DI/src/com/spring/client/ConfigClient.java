package com.spring.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.model.Config;
public class ConfigClient {
	public static void main(String[] args) {
		AbstractApplicationContext ct=new ClassPathXmlApplicationContext("config.xml");
		Config cc=(Config)ct.getBean("config");
		System.out.println(cc.toString());
		//½ÇÇà1
	}//main-end
}//class-end
