package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.ArrayList;
import java.util.List;

public class IngredientService {
    private String fileName;
    private FileService fs;
    private List<Ingredient> ingredients;

    public IngredientService(String fileName) {
        this.fileName = fileName;
        this.fs = new FileService(this.fileName);
        this.ingredients = new ArrayList<>();
    }

    public List<Ingredient> getIngredients() {
        List<String> lines = fs.getLines();
        lines.forEach((line) -> {
            String[] parts = line.split(" ");
            if (parts.length > 4 || parts.length < 3) {
                System.out.println("Bad ingredients");
            } else {
                if ( parts.length == 3) {
                    ingredients.add(new Ingredient(parts[0], parts[1], parts[2]));
                } else {
                    ingredients.add(new Ingredient(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        });
        return ingredients;
    }
}

