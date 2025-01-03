package DbRead;

public class DBTest {
	String url;
	String userName;
	String password;

	public DBTest() {
	}

	public DBTest(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public void display() {
		System.out.println("URL: " + url);
		System.out.println("User name: " + userName);
		System.out.println("Password: " + password);
	}

}
