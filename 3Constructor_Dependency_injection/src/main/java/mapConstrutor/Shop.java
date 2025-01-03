package mapConstrutor;

import java.util.Map;

public class Shop {
	private String name;
	private Map<String, Double> items;

	public Shop() {

	}

	public Shop(String name, Map<String, Double> items) {
		super();
		this.name = name;
		this.items = items;
	}

	public void display() {
		System.out.println("Welcom to" + name + "myyy");
		System.out.println("+==============items=============+");

		for (Map.Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey() + "===>" + entry.getValue());
		}
	}

}
