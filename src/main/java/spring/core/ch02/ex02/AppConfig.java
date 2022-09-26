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
@EnableAspectJAutoProxy를 썼기때문에

@Aspect @Pointcut @Around를 인식할수 있다.

*/