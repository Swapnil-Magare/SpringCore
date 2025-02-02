package NoXmlPractice;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import InjectinDataByautowired.AppConfig;
import InjectinDataByautowired.Car;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);

        Industry in = (Industry) cApp.getBean("industry"); // Matches bean name
        in.budget();
	}
}
