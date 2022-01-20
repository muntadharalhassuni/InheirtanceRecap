package com.company;

//Create a class with the name Ceiling
//There are two member variables for this one
//height and paintedColor both of type int

public class Ceiling {
    private int height;
    private int paintedColor;

    //there should also be a contructor which accepts both member variables as parameters
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
    //there are also two additional methods which should be defined
//getHeight() shall return the value of height
    public int getHeight() {
        return height;
    }
    //and getPaintedColor() should return the value of paintedColor
    public int getPaintedColor() {
        return paintedColor;
    }
}
