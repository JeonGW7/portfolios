package sample1;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch; //처리시간 측정
//공통부분
public class LoggingAdvice implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation Invocation) throws Throwable {
		String methodName=Invocation.getMethod().getName(); //target메서드 이름을 얻는다
		StopWatch sw=new StopWatch(); //StopWatch 기능을 제공
		sw.start(methodName); //시간 측정 시작
		System.out.println(methodName+" 호출 전 처리"); //target메서드 호출전 처리
		Object rtnObj=Invocation.proceed(); //target메서드 실행 sayHello()
		sw.stop(); //시간 측정 끝 
		System.out.println(methodName+" 호출 후 처리"); //target메서드 호출후 처리
		System.out.println("처리시간:"+sw.getTotalTimeMillis()/1000+"초");
		//sw.getTotalTimeMillis()는 측정한 시간 (1/1000)초를 취득한다
		return rtnObj;
	}//invoke-end

}//class-end
