package com.company;

public class Triangle {

    public double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {   //constructor
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        double sp = getPerimeter() / 2;                //sp = semiperimeter

        double area = (Math.sqrt(sp * (sp - side1) * (sp - side2)) * (sp - side3));
        return area;

    }

    public void print() {
        System.out.println("Triangle: ");
        System.out.println(side1 + " " + side2 + " " + side3);

    }
}