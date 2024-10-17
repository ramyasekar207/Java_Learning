package org.example;

public class Circle extends Shapes {
    private int radius ;
    public Circle(int x){
       setRadius(x);
    }

    protected int getRadius()
    {
        return radius;
    }

    protected void setRadius(int radius)
    {
       this.radius = radius;
    }

    @Override
    double area() {
        double area = 3.14 *(getRadius()*getRadius());
        return area;
    }


}



