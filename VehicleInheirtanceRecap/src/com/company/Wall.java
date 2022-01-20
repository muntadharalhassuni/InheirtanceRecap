package com.company;

//create a class with the name Wall.

public class Wall {
    //it contains one member variable, direction
//and is of type String
    private String direction;
    //A contructor for wall should accept one parameter for the member variable direction
    public Wall(String direction)
    {
        this.direction = direction;
    }
//A getter should also be defined for the direction field called getDirection()

    public String getDirection()
    {
        return direction;
    }
}
