package PostConstruct_Pre_Destroy;

public class Person {

	public Person() {
		System.out.println("Object of Person is Created");
	}

	// MAKE THIS AS INIT()
	public void test() {
		System.out.println("Test Invoked");
	}

	// MAKE THIS AS DESTROY()
	public void demo() {
		System.out.println("Demo Invoked");
	}

}
