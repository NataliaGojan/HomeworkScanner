package com.company;
import java.util.Scanner;
public class InputController {

    public static Triangle createTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Enter Triangle***");

        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        return triangle;
    }

    public static Square createSquare() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Enter Square***");

        System.out.print("Enter the side of the Square: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);

        return square;
    }
    public static Circle createCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Enter Circle***");

        System.out.print("Enter the radius of the Circle: ");
        double r = scanner.nextDouble();

        Circle circle = new Circle(r);

        return circle;
    }
}