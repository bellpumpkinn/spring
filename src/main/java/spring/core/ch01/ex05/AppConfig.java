package spring.core.ch01.ex05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.core.ch01.ex05")
public class AppConfig {
	
}


/*
 
베이스패키지 이하를 스캐닝을 하다가,
@Component가 붙어있는걸 보면 IOC한다.


spring.core.ch01.ex05는 루트패키지(베이스패키지)
*/