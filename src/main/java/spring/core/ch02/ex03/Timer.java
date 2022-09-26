package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect   // Bean을 지칭.  갖고있는 기능은 Advice + PointCut
@Component // IOC
public class Timer {
   @Before("execution(* spring..*(int))") // 파라미터가 있는 method
   public void clockStart(JoinPoint jp) {
      System.out.println(jp.toShortString());
      System.out.println("시작 시각: " + LocalDateTime.now());
   } // JP 이전 실행
   
   @After("within(spring..Calculator)") // spring 아래 어딘가에 있는 Calculator class의 method
   public void clockEnd(JoinPoint jp) {
      System.out.println(jp.toShortString());
      System.out.println("종료 시각: " + LocalDateTime.now());
   } // JP 이후 실행
   
   @AfterReturning(pointcut="bean(calc*)", returning="result") // jp의 리턴값에 이름붙이기(파라미터 변수의 이름)
   public void printResult(JoinPoint jp, int result) {
      System.out.println(jp.toShortString() + ": " + result);
   } // JP 리턴한 후 실행
}


/*

 execution = Method의 pattern을 정의
 (*       => 리턴타입은 뭐가 와도 괜찮고, 
  spring..=> 0개 이상의 Something - ex) spring.core ~ / spring.world.hello ~ 등등
  *(int)) => 파라미터가 int인 모든 Method

*/

/*
@Aspect은 Bean을 지칭

target : 핵심 기능을 담고 있는 모듈로 타겟은 부가기능을 부여할 대상이 된다.

advice : 실질적으로 어떤 일을 해야할 지에 대한 것, 
	실질적인 부가기능을 담은 구현체,
	어드바이스는 타겟에 제공할 부가기능을 담고 있는 모듈이다.

AOP advice종류(5가지)
=> Before , AfterReturning, AfterThrowing, After, Around 

Before = joinPoint전에 실행된다.
After = joinPoint 뒤쪽에 실행된다.
AfterReturning = 실행성공한다음에 리턴된다.
AfterThrowing = 
*/

/*
로깅에 관련된 코드 : Aspect

*/