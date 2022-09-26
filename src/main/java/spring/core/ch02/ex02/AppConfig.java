package spring.core.ch02.ex02;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.core.ch02.ex02")
@EnableAspectJAutoProxy
public class AppConfig {
	
}

/*
@EnableAspectJAutoProxy를 썼기때문에 @Aspect @Pointcut @Around를 인식할수 있다.

@Configuration : 스프링 컨테이너에게 해당 클래스를 Bean 구성 class임을 알려주는것.
@Bean 과 @Component는 둘 다 스프링컨테이너에 Bean을 등록하도록하는 어노테이션.

@Component는 개발자가 직접작성한 class를 Bean으로 등록하기위한 어노테이션.

@ComponentScan 은 @Component어노테이션이 부여된 class들을
자동으로 scan하여 Bean으로 등록해주는 역할을 한다.
*/