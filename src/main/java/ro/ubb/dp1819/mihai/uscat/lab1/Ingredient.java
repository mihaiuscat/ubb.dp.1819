package ro.ubb.dp1819.mihai.uscat.lab1;

public class Ingredient {
    private String quantity;
    private String unit;
    private String ingredient;
    private String adjective;

    public Ingredient(String quantity, String unit, String ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
    }

    public Ingredient(String quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getAdjective() {
        if(this.adjective != null) {
            return adjective;
        }
        return "";
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity='" + getQuantity() + '\'' +
                ", unit='" + getUnit() + '\'' +
                ", ingredient='" + getIngredient() + '\'' +
                ", adjective='" + getAdjective() + '\'' +
                '}';
    }
}
