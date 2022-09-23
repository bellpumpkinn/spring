package spring.core.ch01.ex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.ch01.ex01.Pistol;
import spring.core.ch01.ex01.Rifle;
import spring.core.ch01.ex02.Shooter;

@Configuration
public class AppConfig {
	@Bean
	public Pistol pistol() {
		return new Pistol();
	}
	
	@Bean
	public Rifle rifle() {
		return new Rifle();
	}
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol());
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle());
		
		return shooter;
	}
}

/*
 기존의 Spring MVC에서는 xml을 활용하여 Bean을 등록.
 하지만 프로젝트의 규모가 커짐에 따라 사용하는 요소들을 
 xml에 등록하는 것이 상당히 번거로워 져서 어노테이션(Annotation, @)을 
 활용한 Bean 등록 방법이 탄생하게 되었다

 
*/
/*

컨테이너가 IOC할 bean들을 하나씩 선언해줌.
configuration에 있는 메서드들은 id라서 명사로 쓴다.
rifle()  pistol()이 빈의 id.

shooter1은 총을 받아야지 할수있다.



*/