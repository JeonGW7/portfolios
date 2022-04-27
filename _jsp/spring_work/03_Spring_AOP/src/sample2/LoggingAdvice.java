package sample2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;
//POJO(Plain Old Java Object)�� Ŭ������ ���
//����κ�

//Advice�ν� �̿��ϴ� ���� �ٽ��̴�
public class LoggingAdvice {
	//logAround()�� AroundAdvice�� ���� ��ų �޼����ε�
	//�μ��� ProceedingJoinPoint Ÿ���� ����ؾ��Ѵ�
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName=joinPoint.getKind(); //�޼��� �̸����
		StopWatch sw=new StopWatch();
		sw.start(methodName); //���� �ð� ����
		System.out.println(methodName+" �޼��� ȣ����");
		Object reobj=joinPoint.proceed(); //�����Ͻ� ��ü �޼��� ȣ�� �κ�
		System.out.println(methodName+" ȣ�� �� ó��");
		sw.stop(); //�����ð� ���
		System.out.println("ó���ð�:"+sw.getTotalTimeMillis()/1000+"��");
		return reobj;
		
	}//logAround-end

}//class-end
