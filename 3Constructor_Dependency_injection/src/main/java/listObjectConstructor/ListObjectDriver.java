package listObjectConstructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListObjectDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("DI_Constructor_ListObject.xml");

		Student std = (Student) cApp.getBean("StudentObject");
		std.display();
	}

}
