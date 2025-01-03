package ObjectSetter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp=new ClassPathXmlApplicationContext("DI_Setter_Object.xml");
		Person p1 =(Person)cApp.getBean("PersonObject");
		p1.display();
	}

}
