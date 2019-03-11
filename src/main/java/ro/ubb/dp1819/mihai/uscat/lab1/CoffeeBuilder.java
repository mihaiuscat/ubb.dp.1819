package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.List;

public class CoffeeBuilder {
    private List<Ingredient> ingredientList;

    public CoffeeBuilder(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public Coffee createCoffee() {
        return new Coffee(this.ingredientList);
    }
}
