package org.example;

public class Triangle extends Shapes {

    private int base ,height ;

    public Triangle(int x, int y){
        setBase(x);
        setHeight(y);
    }

    protected int getBase() {
        return base;
    }

    protected int getHeight() {
        return height;
    }

    protected void setBase(int base){
        this.base = base;
    }

    protected void setHeight(int height){
        this.height = height;
    }
    @Override
    public double area() {
        double area = 0.5*base*height;
        return area;
    }
}



