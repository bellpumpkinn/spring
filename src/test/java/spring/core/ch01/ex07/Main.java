package spring.core.ch01.ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Lion lion = ctx.getBean(Lion.class);
		lion.shout();
		
		ctx.close();
	}
}

/*
Lion is born. 으로 
IoC가 되면서 빈이 태어났다는걸 확인 가능함.

.close()는 AnnotationConfigApplicationContext을 쓰면 쓸수있음.

*/