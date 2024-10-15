package org.example;

public class Rectangle extends Shapes {

    int length = 10;
    int width = 20;
    @Override
    public double area() {
        double area = length * width;
        return area;
    }
}



