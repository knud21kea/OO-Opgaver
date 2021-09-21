public class Light {

    private String lightName;
    private String status;
    private boolean isSwitchedOn;

    public Light(String lightName, boolean isSwitchedOn) {
        this.lightName = lightName;
        this.isSwitchedOn = isSwitchedOn;
    }
    public Light(String lightName) {
        this.lightName = lightName;
        this.isSwitchedOn = false;
    }

    public void toggleSwitch() {
        isSwitchedOn = !isSwitchedOn;
    }

    public boolean getLightStatus() {
        return isSwitchedOn;
    }

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
