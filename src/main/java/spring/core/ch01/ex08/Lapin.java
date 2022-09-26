package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Lapin {

}

/*
@Scope("prototype") 을 쓴다는건
Lapin(토끼)이 n개가 생길거라는뜻.

@Scope("prototype")은 n개
@Scope과 @Scope("singleton")은 1개.
*/