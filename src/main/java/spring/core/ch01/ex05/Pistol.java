package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

//@Component
public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}

/*

@Component가 발견되면 IOC함.
소문자로 시작하는 pistol이 @Component의 id가 됨.

*/