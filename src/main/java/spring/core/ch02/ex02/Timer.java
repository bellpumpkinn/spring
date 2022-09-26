package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Aspect 역할을 할 클래스를 선언하기 위해 어노테이션 선언
@Aspect // aspect있는게 노란색부분. 코어를 넣는부분이다.
@Component
public class Timer {
	 //PointCut의 속성에 핵심코드의 어느 부분까지 공통 기능을 사용하겟다고 명시
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
	private void myPointcut() {}
	
	//around가 적용될 포인트 컷을 명시 : myPointcut()
	@Around("myPointcut()")
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature());  // 호출되는 메서드에 대한 정보를 구한다.
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed(); // 여기서 조인포인트를 실행시키고
		// 클락이 칼크를 콜했다. 이때 칼크가 실행.
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)");
		return result; // 클락의 리턴한값을 받는다.
	}
}

/*
AOP (관점지향프로그래밍)

여러개의 객체에 공통된 aspect를 갖고있는 객체입니다. 를
@Aspect로 표현.

clac()와 sleep()메서드를 jp(join point)라고 읽는다.

pointcut

포인트컷

aspect 준비해두고 포인트컷해주면 됨.

around aspect

Signature getSignature() :  호출되는 메서드에 대한 정보를 구한다. 
*/