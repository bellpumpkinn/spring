package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shooter {
	private String name;
	private Gun gun;
	
	public void fire() {
		System.out.print(name + ": ");
		gun.fire();
	}
}

/*
DI는 생성자와 setter 2가지방법이있다. 
@NoArgsConstructor : 파라미터가 없는 기본생성자 자동생성
@AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자 자동생성.

*/