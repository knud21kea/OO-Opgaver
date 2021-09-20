import java.util.Random;

public class Dice {

    private int faceValue;
    Random rand = new Random();

    public Dice(int faceValue) {
        this.faceValue = faceValue;
    }

    public void rollDice() {
        faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        return faceValue + " ";
    }
}