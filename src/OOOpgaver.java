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
    }
}
