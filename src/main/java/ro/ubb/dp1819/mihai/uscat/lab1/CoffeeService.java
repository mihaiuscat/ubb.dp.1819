package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService {
    private String fileName;
    private FileService fs;
    private List<Coffee> coffees;

    public CoffeeService(String fileName) {
        this.fileName = fileName;
        this.fs = new FileService(this.fileName);
        this.coffees = new ArrayList<>();
    }

    public List<Coffee> getCoffees() {
        List<String> lines = fs.getLines();
        lines.forEach((line) -> {
            String[] ingredients = line.split(" ");
            if (ingredients.length > 4 || ingredients.length < 3) {
                System.out.println("Bad ingredients");
            } else {
                if ( ingredients.length == 3) {
                    coffees.add(new Coffee(ingredients[0], ingredients[1], ingredients[2]));
                } else {
                    coffees.add(new Coffee(ingredients[0], ingredients[1], ingredients[2], ingredients[3]));
                }
            }
        });
        return coffees;
    }
}

