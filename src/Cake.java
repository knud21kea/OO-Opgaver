public class Cake {

    private Ingredient[] ingredients;
    private double requiredPeople;
    private double ingr1;
    private double ingr2;
    private double ingr3;
    private double ingr4;
    private double ingr5;
    private double ingr6;

    public Cake(double requiredPeople, double ingr1, double ingr2, double ingr3, double ingr4, double ingr5, double ingr6) {
        this.ingr1 = ingr1;
        this.ingr2 = ingr2;
        this.ingr3 = ingr3;
        this.ingr4 = ingr4;
        this.ingr5 = ingr5;
        this.ingr6 = ingr6;
        this.requiredPeople = requiredPeople;
        ingredients = new Ingredient[6];
        ingredients[0] = new Ingredient("Light brown sugar", 0.0, 98.0, 0.1, 380.0);
        ingredients[1] = new Ingredient("Sunflower oil", 100.0, 0.0, 0.0, 884.0);
        ingredients[2] = new Ingredient("Eggs", 9.5, 0.7, 13.0, 143.0);
        ingredients[3] = new Ingredient("Grated carrots", 0.2, 9.6, 0.9, 41.0);
        ingredients[4] = new Ingredient("Raisons", 0.3, 79.0, 3.3, 299.0);
        ingredients[5] = new Ingredient("Flour", 0.9, 78.0, 8.2, 362.0);
    }

    public double getTotalWeight() {
        return requiredPeople * (ingr1 + ingr2 + ingr3 + ingr4 + ingr5 + ingr6) / 8.0;
    }

    public double getBakedWeight() {
        return 0.9 * getTotalWeight();
    }

    public double getTotalFat() {
        double totalFat = 0;
        double[] amounts = {ingr1, ingr2, ingr3, ingr4, ingr5, ingr6};
        for (int i = 0; i < 6; i++) {
            totalFat += amounts[i] * ingredients[i].getIngredientFat() / 100;
        }
        return requiredPeople * totalFat / 8.0;
    }

    public double getTotalCarbohydrate() {
        double totalCarb = 0;
        double[] amounts = {ingr1, ingr2, ingr3, ingr4, ingr5, ingr6};
        for (int i = 0; i < 6; i++) {
            totalCarb += amounts[i] * ingredients[i].getIngredientCarbohydrate() / 100;
        }
        return requiredPeople * totalCarb / 8.0;
    }

    public double getTotalProtein() {
        double totalProtein = 0;
        double[] amounts = {ingr1, ingr2, ingr3, ingr4, ingr5, ingr6};
        for (int i = 0; i < 6; i++) {
            totalProtein += amounts[i] * ingredients[i].getIngredientProtein() / 100;
        }
        return requiredPeople * totalProtein / 8.0;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        double[] amounts = {ingr1, ingr2, ingr3, ingr4, ingr5, ingr6};
        for (int i = 0; i < 6; i++) {
            totalEnergy += amounts[i] * ingredients[i].getIngredientEnergy() / 100;
        }
        return requiredPeople * totalEnergy / 8.0;
    }
}

