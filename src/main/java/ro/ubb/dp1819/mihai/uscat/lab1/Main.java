package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Mihai\\Desktop\\Y3S2\\DP\\lab1\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\mihai\\uscat\\lab1\\coffee.txt";
        IngredientService is = new IngredientService(fileName);
        List<Ingredient> il = is.getIngredients();
        CoffeeBuilder cb = new CoffeeBuilder(il);
        Coffee c = cb.createCoffee();
        CoffeeService cs = new CoffeeService(c);
        System.out.println(cs.getCoffeeType());
    }
}
