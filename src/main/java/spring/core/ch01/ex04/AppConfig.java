package spring.core.ch01.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.core.ch01.ex01.Gun;
import spring.core.ch01.ex02.Shooter;

@Configuration
@Import({Config1.class, Config2.class})
public class AppConfig {
	@Autowired private Gun pistol;
	@Autowired private Gun rifle;
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol);
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle);
		
		return shooter;
	}
}


/*
@Import({Config1.class, Config2.class})
이렇게 하면 3개의 Configuration이 통합이 된다.

@Autowired  -=> DI하는 목적으로 쓴다.
@Autowired를 하면 컨테이너는 해당 빈을 찾아서 DI를 채운다.


*/