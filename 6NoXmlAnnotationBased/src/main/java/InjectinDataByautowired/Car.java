package InjectinDataByautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="car")
public class Car {
	@Value(value="TATA")
	String brand;
	
//	@Autowired
	Engine engine;
	
	
	public Engine getEngine() {
		return engine;
	}

//	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

//	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}
	public void display() {
		engine.start();
	}
	
	
	
	
	

}
