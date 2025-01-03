package MapSetter;

import java.util.Map;

public class Shop {
    private String name;
    private Map<String, Double> items;

    public void Display() {
        System.out.println("Welcome to " + name + " Shop");
        System.out.println("============Items=========");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void setItems(Map<String, Double> items) { // Corrected method name
        this.items = items;
    }
}
