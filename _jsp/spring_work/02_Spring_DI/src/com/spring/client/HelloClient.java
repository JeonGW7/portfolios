package com.spring.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.spring.hello.HelloService;
//클라이언트
//xml에 등록된 빈얻는 방법
public class HelloClient {
	public static void main(String[] args) {
		/*-----------------------------------
		//1. BeanFactory를 이용한 Container 생성
		/*-----------------------------------
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("hello.xml"));
		//빈얻기
		HelloService service=(HelloService)factory.getBean("helloService");
		//실행
		service.sayHello();
		
		*///-------------------------------------
		//2.ApplicationContext를 이용한 Container 생성
		//FileSystemXmlApplicationContext를 이용한 빈 참조, 경로 꼭 확인할 것
		//---------------------------------------
		String xmlFile="D:\\_jsp\\spring_work\\Spring_DI\\xml\\hello.xml";
		ApplicationContext fileCtx=new FileSystemXmlApplicationContext(xmlFile);
		HelloService service2=(HelloService)fileCtx.getBean("helloService");//빈얻기
		
		service2.sayHello(); //실행
		//3.ClassPathXmlApplicationContext를 이용한 빈 참조
		ApplicationContext classPath=new ClassPathXmlApplicationContext("hello.xml");
		HelloService service3=(HelloService)classPath.getBean("helloService");//빈얻기
		service3.sayHello(); //실행
		
		//4.spring.xml만들어서 사용하기
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		HelloService service4=(HelloService)ctx.getBean("helloService"); //빈얻기
		service4.sayHello(); //실행
		
		//5.별칭사용하기
		HelloService service5=(HelloService)ctx.getBean("hello"); //빈얻기
		service5.sayHello();
		
		//6. HelloServiceManager.java 요청받는 클래스
		//	 spring.xml에 등록하고
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("spring.xml");
		HelloService service6=(HelloService)ctx2.getBean("helloBean"); //빈얻기
		service6.sayHello();
	}//main-end
}//class-end
