package com.example.polygonarea;

public class RectangleAreaCalculator implements AreaCalculator{

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    int length;
    int breadth;

    @Override
    public float calculateArea() {
        System.out.println("calculating Rectangle Area"+length*breadth);
        return 0;
    }
}
