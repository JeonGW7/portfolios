package sample1;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch; //ó���ð� ����
//����κ�
public class LoggingAdvice implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation Invocation) throws Throwable {
		String methodName=Invocation.getMethod().getName(); //target�޼��� �̸��� ��´�
		StopWatch sw=new StopWatch(); //StopWatch ����� ����
		sw.start(methodName); //�ð� ���� ����
		System.out.println(methodName+" ȣ�� �� ó��"); //target�޼��� ȣ���� ó��
		Object rtnObj=Invocation.proceed(); //target�޼��� ���� sayHello()
		sw.stop(); //�ð� ���� �� 
		System.out.println(methodName+" ȣ�� �� ó��"); //target�޼��� ȣ���� ó��
		System.out.println("ó���ð�:"+sw.getTotalTimeMillis()/1000+"��");
		//sw.getTotalTimeMillis()�� ������ �ð� (1/1000)�ʸ� ����Ѵ�
		return rtnObj;
	}//invoke-end

}//class-end
