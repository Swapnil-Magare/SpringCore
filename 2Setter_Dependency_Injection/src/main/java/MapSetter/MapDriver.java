package MapSetter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp=new ClassPathXmlApplicationContext("DI_Setter_Map.xml");
		Shop shop = (Shop)cApp.getBean("ShopObject");
		shop.Display();
	}

}
