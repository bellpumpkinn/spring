package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

//@Component("rifleGun")
public class Rifle implements Gun{
	@Override
	public void fire() {
		System.out.println("소총 탕탕.");
	}
}

/*

@Component가 발견되면 IOC함.

@Component옆의
rifleGun이 id가 된다.
*/