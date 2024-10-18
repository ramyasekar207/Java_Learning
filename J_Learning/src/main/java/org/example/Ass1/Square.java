package org.example.Ass1;

public class Square extends Shapes {

    private int length;

    public Square(int x){
        setLength(x);
    }

    protected int getLength(){
        return length;
    }

    protected void setLength(int length){
        this.length = length;
    }


    @Override
    public double area() {
        double area = getLength() * getLength();
        return area;
    }
}



