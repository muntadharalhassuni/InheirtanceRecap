package com.company;

//create a class and name it Bed
public class Bed {
    //Five private member variables should be declared
//style of type String.
    private String style;
    //pillows,height,sheets,quilt of type int
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    //a contructor should be coded which accepts these five member variables as parameters
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    //also six methods should be defined:
//make() has no return type
    public void make()
    {
//and prints a message of the bed being made
        System.out.println("Bed -> Making");
    }
    //getStyle() which returns the value of style
    public String getStyle() {
        return style;
    }
    //getPillows() returns the number of pillows
    public int getPillows() {
        return pillows;
    }
    //getHeight() returns the height of the bed
    public int getHeight() {
        return height;
    }
    //getSheets() returns the number of sheets on the bed
    public int getSheets() {
        return sheets;
    }
    //getQuilt() returns the value of quilt
    public int getQuilt() {
        return quilt;
    }
}
