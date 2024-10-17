package org.example;

public class Triangle extends Shapes {

    int base ,height ;

    public Triangle(int x, int y){
        base = x;
        height = y;
    }

    @Override
    public double area() {
        double area = 0.5*base*height;
        return area;
    }
}



