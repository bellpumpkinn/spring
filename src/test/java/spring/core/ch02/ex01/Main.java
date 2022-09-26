package spring.core.ch02.ex01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Rabbit rabbit = new Rabbit();
		
		calculator.start();
		rabbit.start();
	}
}

/*
콘솔에 나오는 시간단위 : ms(밀리세컨드)

*/