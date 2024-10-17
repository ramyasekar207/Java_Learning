package org.example;

public class Rectangle extends Shapes {

   private int length,width;


    public Rectangle(int x, int y){
        setLength(x);
        setWidth(y);
    }

    protected int getLength(){
        return length;
    }
    protected int getWidth(){
        return width;
    }

    protected void setLength(int length){
        this.length = length;
    }

    protected void setWidth(int width){
        this.width = width;
    }

    @Override
    public double area() {
        double area = getLength() * getWidth();
        return area;
    }
}



