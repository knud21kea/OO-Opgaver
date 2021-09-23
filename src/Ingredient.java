public class Ingredient {

    private final String ingredientName;
    private final double ingredientFat;
    private final double ingredientCarbohydrate;
    private final double ingredientProtein;
    private final double ingredientEnergy;

    public Ingredient(String ingredientName, double ingredientFat, double ingredientCarbohydrate, double ingredientProtein, double ingredientEnergy) {
        this.ingredientName = ingredientName;
        this.ingredientFat = ingredientFat;
        this.ingredientCarbohydrate = ingredientCarbohydrate;
        this.ingredientProtein = ingredientProtein;
        this.ingredientEnergy = ingredientEnergy;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public double getIngredientFat() {
        return ingredientFat;
    }

    public double getIngredientCarbohydrate() {
        return ingredientCarbohydrate;
    }

    public double getIngredientProtein() {
        return ingredientProtein;
    }

    public double getIngredientEnergy() {
        return ingredientEnergy;
    }

    @Override
    public String toString() {
        return ingredientName + ingredientFat + ingredientCarbohydrate + ingredientProtein + ingredientEnergy;
    }
}
