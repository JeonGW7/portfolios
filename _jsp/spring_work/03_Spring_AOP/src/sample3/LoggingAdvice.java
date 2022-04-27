package sample3;
import org.aspectj.lang.annotation.Around; //메서드 실행 전후
import org.aspectj.lang.annotation.Aspect; //모듈=객체
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;
//공통부분
@Aspect
public class LoggingAdvice { //POJO로 작성
	@Around("execution(public * sample3.*.sayHello())")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName=joinPoint.getKind(); //target의 메서드 이름 얻기 sayHello
		StopWatch sw=new StopWatch();
		sw.start(methodName); //시작 시간 측정
		System.out.println(methodName+" 호출 전 처리");
		Object reObj=joinPoint.proceed(); //비지니스  객체 메서드 호출 sayHello 호출된다
		sw.stop(); //측정종료
		System.out.println(methodName+" 호출 후  처리");
		System.out.println("처리시간:"+sw.getTotalTimeMillis()/1000+"초");
		return reObj;
	}//logAround-end
}//class-end


//어노테이션
//@Aspect =>Advice클래스에 마크를 부여하는 어노테이션
//@Aroud => AroundAdvice 메서드에 부여하는 어노테이션
//@Before => BeforeAdvice 메서드에 부여하는 어노테이션
//@After => AfterAdvice 메서드에 부여하는 어노테이션
//@AfterReturning => AfterReturning메서드에 부여하는 어노테이션
//@AfterThrowing => AfterThrowingAdvice메서드에 부여하는 어노테이션