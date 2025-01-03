package InjectinDataByautowired;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import NoXmlAnnotationBased.Student;


public class AutowiredDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);

//  VARIABLE INJECTION
		Car std = (Car) cApp.getBean("car");
		std.display();
	System.out.println(std);
	}

}
