package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "C://Users//mihai//Desktop//test.txt";
        IngredientService cs = new IngredientService(fileName);
        List<Ingredient> l = cs.getIngredients();
        l.forEach((c) -> System.out.println(c));
    }
}
