package ListObjectSetter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListObjectDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp=new ClassPathXmlApplicationContext("DI_Setter_ListObject.xml");
		Student std = (Student)cApp.getBean("StudentObject");
		std.Display();
	}

}
