package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.HashMap;
import java.util.Map;

public class CoffeeService {
    private Coffee coffee;
    private Map<String, String> coffeeTypes;

    public CoffeeService(Coffee coffee) {
        this.coffee = coffee;
        this.coffeeTypes = new HashMap<String, String>() {{
            put("2 cups water + 0.25 cups coffee-beans roasted", "espresso");
            put("2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk", "cappuccino");
            put("4 cups water + 0.25 cups coffee-beans roasted", "americano");
            put("4 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk", "latte");
        }};
    }
    public String getCoffeeType() {
        return this.coffeeTypes.get(this.coffee.toString());
    }
}
