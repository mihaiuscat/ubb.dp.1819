package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.List;

public class Coffee {
    private List<Ingredient> ingredients;

    public Coffee(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        String stringified = "";
        int j = 0;
        for (Ingredient i : ingredients) {
            stringified += (i.getQuantity() + ' ' + i.getUnit() + ' ' + i.getIngredient() + ' ' + i.getAdjective());
            if (++j != ingredients.size()) {
                stringified += "+ ";
            }
        }
        return stringified;
    }
}
