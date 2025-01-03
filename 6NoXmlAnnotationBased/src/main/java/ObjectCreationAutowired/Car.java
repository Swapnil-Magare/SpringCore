package ObjectCreationAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value(value="TATA")
	String brand;
	
	@Autowired
	Engine engine;

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}
	public void display() {
		engine.start();
	}
	
	
	
	
	

}
