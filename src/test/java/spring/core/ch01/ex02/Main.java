package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}

/*
xml문서를 읽어들일수있는 컨테이너 = ClassPathXmlApplicationContext
컨테이너 준비됐으면 (=IOC DI가 완료됐으면)

shooter1의 bean을 꺼내는거 getBean.

spring.core에서는 
IOC DI AOP 개념 익히는게 주.
*/