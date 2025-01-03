package objectConstrctor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectDriver {
public static void main(String[] args) {
	ConfigurableApplicationContext cApp=new ClassPathXmlApplicationContext("DI_Constructor_Object.xml");
	
	Car car= (Car) cApp.getBean("CarObject");
	car.display();
}
}
