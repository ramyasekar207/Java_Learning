package org.example.Ass1;

import org.example.Ass1.Circle;
import org.example.Ass1.Rectangle;
import org.example.Ass1.Square;
import org.example.Ass1.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle(10);
        System.out.println("Area of Circle : "+circle.area());

        Rectangle rec = new Rectangle(10,20);
        System.out.println("Area of Rectangle : "+rec.area());

        Square squ = new Square(10);
        System.out.println("Area of Square : "+squ.area());

        Triangle tri = new Triangle(10,4);
        System.out.println("Area of Triangle : "+tri.area());
    }
}