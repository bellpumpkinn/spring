package spring.core.ch02.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class);
		Rabbit rabbit = ctx.getBean(Rabbit.class);
		
		System.out.println(calculator.calc().getResult());
		//계산기의 calc()를 콜한다. 
		System.out.println(rabbit.sleep().getResult());
	}
}

/*
Result spring.core.ch02.ex02.Calculator.calc()
경과시간: 920 는 clock()이 만들어 낸거고

1(clock)는 calc()가 만들어낸거.
*/