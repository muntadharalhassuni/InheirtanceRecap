package com.company;

//Create a class with the name Bedroom.
//This class contains eight member variables

public class Bedroom {
    //name of type String
    private String name;
    //wall1,wall2,wall3,wall4 of type Wall
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    //ceiling of type Ceiling
    private Ceiling ceiling;
    //bed of type Bed
    private Bed bed;
    //lamp of type Lamp
    private Lamp lamp;
    //the class constructor should be accept all eight of the member variables
//as parameters, and there should also be two additional methods
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    //there should also be two additional methods
//getLamp() which returns an object of type lamp
    public Lamp getLamp()
    {
        return this.lamp;
    }
    //and makeBed() which prints a message that the bed is being made.
    public void makeBed()
    {
        System.out.println("Bedroom -> Making bed");
//and also calls the make() method in the Bed class
        bed.make();
    }
}
