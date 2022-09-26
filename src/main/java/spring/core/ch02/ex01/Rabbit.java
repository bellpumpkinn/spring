package spring.core.ch02.ex01;

public class Rabbit {
	public void sleep() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch (Exception e) {}
	}
	
	public void start() {
		long start = System.currentTimeMillis();
		sleep();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
	}
}

/*

currentTimeMillis 
=>  1970년 1월 1일 00:00:00.000 을 기준으로한 현제 시간의 차이를 long형으로 반환

start : 시작시간을 구하고
calc() 돌리고
end : 끝난 시간을 구한다.

end - start = 경과시간이 된다.

*/