package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
	private void myPointcut() {}
	
	@Around("myPointcut()")
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature());
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)");
		return result;
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
*/