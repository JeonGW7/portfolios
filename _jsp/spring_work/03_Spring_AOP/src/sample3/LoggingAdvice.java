package sample3;
import org.aspectj.lang.annotation.Around; //�޼��� ���� ����
import org.aspectj.lang.annotation.Aspect; //���=��ü
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;
//����κ�
@Aspect
public class LoggingAdvice { //POJO�� �ۼ�
	@Around("execution(public * sample3.*.sayHello())")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName=joinPoint.getKind(); //target�� �޼��� �̸� ��� sayHello
		StopWatch sw=new StopWatch();
		sw.start(methodName); //���� �ð� ����
		System.out.println(methodName+" ȣ�� �� ó��");
		Object reObj=joinPoint.proceed(); //�����Ͻ�  ��ü �޼��� ȣ�� sayHello ȣ��ȴ�
		sw.stop(); //��������
		System.out.println(methodName+" ȣ�� ��  ó��");
		System.out.println("ó���ð�:"+sw.getTotalTimeMillis()/1000+"��");
		return reObj;
	}//logAround-end
}//class-end


//������̼�
//@Aspect =>AdviceŬ������ ��ũ�� �ο��ϴ� ������̼�
//@Aroud => AroundAdvice �޼��忡 �ο��ϴ� ������̼�
//@Before => BeforeAdvice �޼��忡 �ο��ϴ� ������̼�
//@After => AfterAdvice �޼��忡 �ο��ϴ� ������̼�
//@AfterReturning => AfterReturning�޼��忡 �ο��ϴ� ������̼�
//@AfterThrowing => AfterThrowingAdvice�޼��忡 �ο��ϴ� ������̼�