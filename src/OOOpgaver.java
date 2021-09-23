import java.util.Scanner;

public class OOOpgaver {

    public static void main(String[] args) {

        //Person class with name and age attributes
        Person person = new Person("Graham", 19);
        person.hasBirthday();
        System.out.println(person.toString());

        //Dice class with face value attribute
        Dice dice = new Dice(6);
        int[] diceThrow = new int[5];
        int diceTotal = 0;
        for (int i = 0; i < 5; i++) {
            dice.rollDice();
            diceThrow[i] = dice.getFaceValue();
            System.out.print(diceThrow[i] + " ");
            diceTotal += diceThrow[i];
        }
        System.out.println("Total is: " + diceTotal);

        //Room class with lights class
        Room.main(args);

        //Cake version 2 with cake class and ingredient class
        //Ingredients class independent of cake
        Ingredient[] ingredients = new Ingredient[6];
        ingredients[0] = new Ingredient("Light brown sugar", 0.0, 98.0, 0.1, 380.0);
        ingredients[1] = new Ingredient("Sunflower oil", 100.0, 0.0, 0.0, 884.0);
        ingredients[2] = new Ingredient("Eggs", 9.5, 0.7, 13.0, 143.0);
        ingredients[3] = new Ingredient("Grated carrots", 0.2, 9.6, 0.9, 41.0);
        ingredients[4] = new Ingredient("Raisons", 0.3, 79.0, 3.3, 299.0);
        ingredients[5] = new Ingredient("Flour", 0.9, 78.0, 8.2, 362.0);

        //Intro
        System.out.println("\nRecipe to make a carrot cake.");
        System.out.println("The program calculates quantities for the required number of people");
        Scanner in = new Scanner(System.in);

        //Input required people
        final int defaultPeople = 8;
        System.out.print("How many people is the cake for? ");
        double people = in.nextDouble();

        //object of class Cake with recipe data (ingredients in grams for default number of people)
        Cake cake1 = new Cake(people, 175.0, 160.0, 150.0, 140.0, 100.0, 175.0, ingredients);
        cake1.printIngredientsAndQuantities();
        System.out.printf("%-24s %4.1f %s", "\nTotal weight is: ", cake1.getTotalWeight(), "g");
        System.out.printf("%-24s %4.1f %s", "\nBaked weight is: ", cake1.getBakedWeight(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal fat is: ", cake1.getTotalFat(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal carbohydrate is: ", cake1.getTotalCarbohydrate(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal protein is: ", cake1.getTotalProtein(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal energy is: ", cake1.getTotalEnergy(), "kcal");
    }
}
