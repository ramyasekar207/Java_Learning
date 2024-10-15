package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle();
        System.out.println("Area of Circle : "+circle.area());

        Rectangle rec = new Rectangle();
        System.out.println("Area of Rectangle : "+rec.area());

        Square squ = new Square();
        System.out.println("Area of Square : "+squ.area());

        Triangle tri = new Triangle();
        System.out.println("Area of Triangle : "+tri.area());
    }
}