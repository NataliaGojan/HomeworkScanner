package com.company;

import java.sql.SQLOutput;

public class OutputController {

   static void printAreaAndPerimeter (Triangle triangle) {

       System.out.println("Perimeter of Triangle is: " +  triangle.getPerimeter());

       System.out.println("Area of Triangle is:  " + triangle.getArea());
     }

    static void printAreaAndPerimeter (Square square) {

        System.out.println("Perimeter of Square is: " +  square.getPerimeter());

        System.out.println("Area of Square is:  " + square.getArea());
    }

    static void printAreaAndPerimeter (Circle circle) {

        System.out.println("Perimeter of Circle is: " +  circle.getPerimeter());

        System.out.println("Area of Circle is:  " + circle.getArea());
    }

}