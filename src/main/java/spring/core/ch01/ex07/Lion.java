package spring.core.ch01.ex07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Lion implements InitializingBean, DisposableBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Lion is born.");
	}
	
	public void shout() {
		System.out.println("Lion shout");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Lion is dead.");
	}
}


/*

spring 기본속성(InitializingBean, DisposableBean)을 상속한거.
IoC하기 위해선 @Component를 붙여준다.

afterPropertiesSet() 가 호출됐다는것은
빈이 막 IoC에서 생성됐다는것.
*/
