package org.example;

public class Circle extends Shapes {
    int r ;
    public Circle(int x){
        r  = x;
    }

    @Override
    double area() {
        double area = 3.14 *(r*r);
        return area;
    }


}



