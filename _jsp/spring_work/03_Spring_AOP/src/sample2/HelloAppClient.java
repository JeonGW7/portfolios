package sample2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloAppClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("beans2.xml");
		MessageBean bb=(MessageBean)ct.getBean("target");
		bb.sayHello();
		//beans2.xml ����
		//<aop:config>��Ҹ� ����ؼ� AOP�����ϴ� ����
		//�ڽ� ��Ҵ� <aop:aspect>��Ұ� �ִ�
		//���⼭ advice�� ������
		//ref�Ӽ����� advice�� ���� -> ref="loggingAdvice"
		//<aop:pointcut>��ҿ� pointcut�� �����ϰ�
		//<aop:around>��ҿ�
		//AroundAdvice(JoinPoint �յڿ��� ����Ǵ� Advice�ΰ��� �����)
	}//main-end
}//class-end
