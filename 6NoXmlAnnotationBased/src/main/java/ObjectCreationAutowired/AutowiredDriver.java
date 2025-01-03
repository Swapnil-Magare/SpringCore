package ObjectCreationAutowired;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
