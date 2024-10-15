package org.example;

public class Triangle extends Shapes {

    int base = 10;
    int height = 4;

    @Override
    public double area() {
        double area = 0.5*base*height;
        return area;
    }
}



