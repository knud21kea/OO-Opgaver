public class OOOpgaver {

    public static void main(String[] args) {
        Person person = new Person("Graham", 59);
        person.hasBirthday();
        System.out.println(person.toString());

        Dice dice = new Dice(6);
        int[] diceThrow = new int[5];
        int diceTotal = 0;
        for (int i = 0; i < 5; i++) {
            dice.rollDice();
            diceThrow[i] = dice.getFaceValue();
            System.out.print(diceThrow[i] + " ");
            diceTotal += diceThrow[i];
        }
        System.out.print("Total is: " + diceTotal);
    }
}
