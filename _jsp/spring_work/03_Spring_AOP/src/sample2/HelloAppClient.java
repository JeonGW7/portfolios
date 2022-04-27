package sample2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloAppClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("beans2.xml");
		MessageBean bb=(MessageBean)ct.getBean("target");
		bb.sayHello();
		//beans2.xml 설명
		//<aop:config>요소를 사용해서 AOP설정하는 예제
		//자식 요소는 <aop:aspect>요소가 있다
		//여기서 advice를 정의함
		//ref속성에서 advice를 참조 -> ref="loggingAdvice"
		//<aop:pointcut>요소에 pointcut을 정의하고
		//<aop:around>요소에
		//AroundAdvice(JoinPoint 앞뒤에서 실행되는 Advice인것을 기술함)
	}//main-end
}//class-end
