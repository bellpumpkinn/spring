package spring.core.ch02.ex02;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Result {
	private Object result;
}

/*
Object타입이니까 어떤타입의 객체든 가능.

lombok의 @Setter, @Getter는 
따로 getter와 setter를 안만들어줘도 되는 기능을 수행한다.

*/