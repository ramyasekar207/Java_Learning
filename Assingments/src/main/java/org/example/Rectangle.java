package org.example;

public class Rectangle extends Shapes {

    int length,width;


    public Rectangle(int x, int y){
         length = x;
         width = y;
    }
    @Override
    public double area() {
        double area = length * width;
        return area;
    }
}



