public class Light {

    private String lightName;
    private String status;
    private boolean isSwitchedOn;

    public Light(String lightName, boolean isSwitchedOn) {
        this.lightName = lightName;
        this.isSwitchedOn = isSwitchedOn;
    }

    //Overload - default to switched off (false)
    public Light(String lightName) {
        this.lightName = lightName;
        this.isSwitchedOn = false;
    }

    //Push switch
    public void toggleSwitch() {
        isSwitchedOn = !isSwitchedOn;
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
