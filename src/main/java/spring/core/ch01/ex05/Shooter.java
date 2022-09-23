package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifleGun;
	
	public void fire() {
		try {
			pistol.fire();
			rifleGun.fire();
		} catch(Exception e) {}
	}
}


/*
타입이 gun이면서 pistol이 id인 DI를 찾는다.

타입이 gun이면서 rifle이 id인 DI를 찾는다.
하지만 없다. id를 rifleGun으로 했기 때문이다.


1. 해당하는 Component를 찾는다.
2. 근데 중복되면 id로 찾는다.

Gun타입이 하나면 2개에 다 rifle만 집어넣는다.

@Nullable => null값이어도 괜찮다는 뜻.
*/