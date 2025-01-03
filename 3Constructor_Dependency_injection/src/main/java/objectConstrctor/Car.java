package objectConstrctor;

public class Car {
	String brand;
	Engine engine;

	public Car() {

	}

	public Car(String brand, Engine engine) {

		this.brand = brand;
		this.engine = engine;
	}

	public void display() {
		System.out.println("Car Brand: " + brand);
		System.out.println("Engine cc: " + engine.cc);
	}

}
