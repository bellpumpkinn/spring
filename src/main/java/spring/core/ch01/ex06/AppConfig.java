package spring.core.ch01.ex06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "spring.core.ch01.ex06", 
		excludeFilters = @Filter(type = FilterType.ANNOTATION,
						classes = (NoComponent.class)))
public class AppConfig {
	
}	

/*

NoComponent빼고 IoC시킬거다.

excludeFilters 제외시키는 필터.
NoComponent붙어져있으면 IOC에서 제외시킨다.
*/