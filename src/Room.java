import java.util.Scanner;

public class Room {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Lights class with overload

        //Initialise
        Light tableLight = new Light("Table light", true);
        Light spotLight = new Light("Spot light", true);
        Light readingLight = new Light("Reading light", true);
        Light moodLight = new Light("Mood light", true);
        Light concealedLight = new Light("Concealed light"); //overload

        //todo - interface to allow user to switch a light
        moodLight.toggleSwitch();
        System.out.println(tableLight.toString());
        System.out.println(spotLight.toString());
        System.out.println(readingLight.toString());
        System.out.println(moodLight.toString());
        System.out.println(concealedLight.toString());
        moodLight.toggleSwitch();
        System.out.println(moodLight.toString());
        System.out.println("Lights: " + Light.getCountLights());
        System.out.println("Switches: " + moodLight.getCountSwitches());
    }
}
