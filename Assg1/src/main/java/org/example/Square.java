package org.example;

public class Square extends Shapes {

    int length = 10;

    @Override
    public double area() {
        double area = length * length;
        return area;
    }
}



