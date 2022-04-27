package sample2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;
//POJO(Plain Old Java Object)의 클래스를 사용
//공통부분

//Advice로써 이용하는 것이 핵심이다
public class LoggingAdvice {
	//logAround()는 AroundAdvice로 동작 시킬 메서드인데
	//인수를 ProceedingJoinPoint 타입을 사용해야한다
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName=joinPoint.getKind(); //메서드 이름얻기
		StopWatch sw=new StopWatch();
		sw.start(methodName); //시작 시간 측정
		System.out.println(methodName+" 메서드 호출전");
		Object reobj=joinPoint.proceed(); //비지니스 객체 메서드 호출 부분
		System.out.println(methodName+" 호출 후 처리");
		sw.stop(); //측정시간 출력
		System.out.println("처리시간:"+sw.getTotalTimeMillis()/1000+"초");
		return reobj;
		
	}//logAround-end

}//class-end
