package spring.core.ch01.ex05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.core.ch01.ex05")
public class AppConfig {
	
}


/*
 
스캐닝을 하다가,
@Component가 붙어있는걸 IOC한다.

*/