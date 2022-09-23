package spring.core.ch01.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.ch01.ex02.Shooter;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}

/*
스프링컨테이너를 ApplicationContext라고 한다.
ApplicationContext는 BeanFactory 인터페이스의 하위 인터페이스
즉, ApplicationContext는 BeanFactory에 부가기능을 추가한 것이다.
스프링 컨테이너 내부에는 빈 저장소가 존재
빈 저장소는 key로 빈 이름을 가지고 있으며, 
value로 실제 빈 객체를 가지고 있다
스프링 컨테이너는 기본적으로 빈을 싱글톤으로 관리한다.

싱글톤 패턴
=> 객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다.
   '하나'의 인스턴스만 생성하여 사용하는 디자인 패턴.
   인스턴스가 필요할 때, 똑같은 인스턴스를 만들지 않고, 
   기존의 인스턴스를 활용하는 것.
*/