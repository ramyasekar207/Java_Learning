package org.example;

public class Square extends Shapes {

    int length;

    public Square(int x){
        length = x;
    }

    @Override
    public double area() {
        double area = length * length;
        return area;
    }
}



