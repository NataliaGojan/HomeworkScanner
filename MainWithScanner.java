package com.company;
import java.util.Scanner;

public class MainWithScanner {
    public static void main(String[] args) {

        Triangle triangle = InputController.createTriangle();
        OutputController.printAreaAndPerimeter(triangle);

        System.out.println(" ");

        Square square = InputController.createSquare();
        OutputController.printAreaAndPerimeter(square);

        System.out.println(" ");

        Circle circle = InputController.createCircle();
        OutputController.printAreaAndPerimeter(circle);

    }
}