package ListSetter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp=new ClassPathXmlApplicationContext("DI_Setter_List.xml");
		Student std = (Student)cApp.getBean("StudentList");
		std.display();
	}

}
