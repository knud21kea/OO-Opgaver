public class Cake {

    private final Ingredient[] ingredients;
    private final double[] quantities;
    private final double requiredPeople;

    public Cake(double requiredPeople, double ingr1, double ingr2, double ingr3, double ingr4, double ingr5, double ingr6, Ingredient[] ingredients) {
        this.ingredients = ingredients;
        quantities = new double[]{0, 0, 0, 0, 0, 0};
        this.quantities[0] = ingr1;
        this.quantities[1] = ingr2;
        this.quantities[2] = ingr3;
        this.quantities[3] = ingr4;
        this.quantities[4] = ingr5;
        this.quantities[5] = ingr6;
        this.requiredPeople = requiredPeople;
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < 6; i++) {
            totalWeight += quantities[i];
        }
        return requiredPeople * totalWeight / 8.0;
    }

    public double getBakedWeight() {
        return 0.9 * getTotalWeight();
    }

    public void printIngredientsAndQuantities() {
        System.out.println("\nRecipe for " + requiredPeople + " people:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-23s %4.1f %s", ingredients[i].getIngredientName(), requiredPeople * quantities[i] / 8, "g\n");
        }
    }

    public double getTotalFat() {
        double totalFat = 0;
        for (int i = 0; i < 6; i++) {
            totalFat += quantities[i] * ingredients[i].getIngredientFat() / 100;
        }
        return requiredPeople * totalFat / 8.0;
    }

    public double getTotalCarbohydrate() {
        double totalCarb = 0;
        for (int i = 0; i < 6; i++) {
            totalCarb += quantities[i] * ingredients[i].getIngredientCarbohydrate() / 100;
        }
        return requiredPeople * totalCarb / 8.0;
    }

    public double getTotalProtein() {
        double totalProtein = 0;
        for (int i = 0; i < 6; i++) {
            totalProtein += quantities[i] * ingredients[i].getIngredientProtein() / 100;
        }
        return requiredPeople * totalProtein / 8.0;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (int i = 0; i < 6; i++) {
            totalEnergy += quantities[i] * ingredients[i].getIngredientEnergy() / 100;
        }
        return requiredPeople * totalEnergy / 8.0;
    }
}

