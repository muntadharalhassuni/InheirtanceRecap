package com.company;

//Create a class and name it Lamp
public class Lamp {
    //inside this class should be declared three member variables
//style of type String.
    private String style;
    //battery of type boolean
    private boolean battery;
    //globRating of type int
    private int globRating;
//all variables should be marked private

    // a constructor needs to be created which accepts the three member variables as parameters
    public Lamp(String style, boolean battery, int globRatting) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRatting;
    }
//in addition, four methods should be created :
//turnOn() has no return type.
    public void turnOn()
    {
// should print a message that the lamp is being turned on
        System.out.println("Lamp -> Turning on");
    }
    //getStyle() returns the lamp style
    public String getStyle() {
        return style;
    }
    //isBattery() returns the value of battery
    public boolean isBattery() {
        return battery;
    }
    //getGlobRating() returns the globRating of the lamp
    public int getGlobRating() {
        return globRating;
    }
}
