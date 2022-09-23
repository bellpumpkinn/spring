package spring.core.ch01.ex06;

import org.springframework.stereotype.Component;

@Component
public class Pistol {
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}

/*

@Component를 붙이니까 얘는 IoC가 된다.

*/