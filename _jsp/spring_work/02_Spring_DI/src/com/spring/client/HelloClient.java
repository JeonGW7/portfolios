package com.spring.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.spring.hello.HelloService;
//Ŭ���̾�Ʈ
//xml�� ��ϵ� ���� ���
public class HelloClient {
	public static void main(String[] args) {
		/*-----------------------------------
		//1. BeanFactory�� �̿��� Container ����
		/*-----------------------------------
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("hello.xml"));
		//����
		HelloService service=(HelloService)factory.getBean("helloService");
		//����
		service.sayHello();
		
		*///-------------------------------------
		//2.ApplicationContext�� �̿��� Container ����
		//FileSystemXmlApplicationContext�� �̿��� �� ����, ��� �� Ȯ���� ��
		//---------------------------------------
		String xmlFile="D:\\_jsp\\spring_work\\Spring_DI\\xml\\hello.xml";
		ApplicationContext fileCtx=new FileSystemXmlApplicationContext(xmlFile);
		HelloService service2=(HelloService)fileCtx.getBean("helloService");//����
		
		service2.sayHello(); //����
		//3.ClassPathXmlApplicationContext�� �̿��� �� ����
		ApplicationContext classPath=new ClassPathXmlApplicationContext("hello.xml");
		HelloService service3=(HelloService)classPath.getBean("helloService");//����
		service3.sayHello(); //����
		
		//4.spring.xml���� ����ϱ�
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		HelloService service4=(HelloService)ctx.getBean("helloService"); //����
		service4.sayHello(); //����
		
		//5.��Ī����ϱ�
		HelloService service5=(HelloService)ctx.getBean("hello"); //����
		service5.sayHello();
		
		//6. HelloServiceManager.java ��û�޴� Ŭ����
		//	 spring.xml�� ����ϰ�
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("spring.xml");
		HelloService service6=(HelloService)ctx2.getBean("helloBean"); //����
		service6.sayHello();
	}//main-end
}//class-end
