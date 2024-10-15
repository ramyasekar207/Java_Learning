package org.example;

public class Circle extends Shapes {

    int r = 10;
    @Override
    public double area() {
        double area = 3.14 *(r*r);
//        System.out.println("Area of Circle : "+area);
        return area;
    }
}



