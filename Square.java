package com.company;

public class Square {

    public double side;

    public Square (double side) {   //constructor
        this.side = side;
    }

    double getPerimeter() {
        return side*4;
    }

    double getArea() {
        return side*2;

    }

}
