package sample1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloAppClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");
		MessageBean bean=(MessageBean)ct.getBean("proxy");
		bean.sayHello();
	}//main-end
}//class-end
