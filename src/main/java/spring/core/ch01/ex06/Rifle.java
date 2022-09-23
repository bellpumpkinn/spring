package spring.core.ch01.ex06;

import org.springframework.stereotype.Component;

@NoComponent
public class Rifle {
	public void fire() {
		System.out.println("소총 탕탕.");
	}
}

/*
IOC 안할거다.라할때 @NoComponent씀.


*/