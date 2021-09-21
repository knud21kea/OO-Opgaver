import java.util.Scanner;

public class Room {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Lights class with overload

        Light tableLight = new Light("Table light", false);
        Light spotLight = new Light("Spot light", false);
        Light readingLight = new Light("Reading light", false);
        Light moodLight = new Light("Mood light", false);
        Light concealedLight = new Light("Concealed light");
        moodLight.toggleSwitch();
        System.out.println(tableLight.toString());
        System.out.println(spotLight.toString());
        System.out.println(readingLight.toString());
        System.out.println(moodLight.toString());
        System.out.println(concealedLight.toString());
    }
}
