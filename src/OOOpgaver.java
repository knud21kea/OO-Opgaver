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

        Room.main(args);

        //Cake version 2 with cake class and ingredient class
        //Intro
        System.out.println("\nRecipe to make a carrot cake.");
        System.out.println("The program calculates quantities for the required number of people");
        Scanner in = new Scanner(System.in);

        //Input required people
        final int defaultPeople = 8;
        System.out.print("How many people is the cake for? ");
        double people = in.nextDouble();

        //object of class Cake with recipe data (ingredients in grams for default number of people
        Cake cake1 = new Cake(people, 175.0, 160.0, 150.0, 140.0, 100.0, 175.0);
        System.out.printf("%-24s %4.1f %s", "\nTotal weight is: ", cake1.getTotalWeight(), "g");
        System.out.printf("%-24s %4.1f %s", "\nBaked weight is: ", cake1.getBakedWeight(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal fat is: ", cake1.getTotalFat(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal carbohydrate is: ", cake1.getTotalCarbohydrate(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal protein is: ", cake1.getTotalProtein(), "g");
        System.out.printf("%-24s %4.1f %s", "\nTotal energy is: ", cake1.getTotalEnergy(), "kcal");
    }
}
