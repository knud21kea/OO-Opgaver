public class Light {

    private String lightName;
    private String status;
    private boolean isSwitchedOn;
    private static int countLights = 0;
    private int countSwitches = 0;

    public Light(String lightName, boolean isSwitchedOn) {
        this.lightName = lightName;
        this.isSwitchedOn = isSwitchedOn;
        countLights++;
    }

    //Overload - default to switched off (false)
    public Light(String lightName) {
        this.lightName = lightName;
        this.isSwitchedOn = false;
        countLights++;
    }

    public static int getCountLights() {
        return countLights;
    }

    public int getCountSwitches() {
        return this.countSwitches;
    }

    //Push switch
    public void toggleSwitch() {
        isSwitchedOn = !isSwitchedOn;
        countSwitches++;
    }

    public boolean getLightStatus() {
        return isSwitchedOn;
    }

    //Output state for 1 light - convert true/false to on/off
    @Override
    public String toString() {
        if (isSwitchedOn) {
            status = "on";
        } else {
            status = "off";
        }
        return lightName + " is switched " + status;
    }
}
