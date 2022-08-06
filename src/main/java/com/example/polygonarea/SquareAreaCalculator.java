package com.example.polygonarea;

public class SquareAreaCalculator implements AreaCalculator{


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int length;


    @Override
    public float calculateArea() {
        System.out.println("calculating Square Area" + length*length);
        return 0;
    }
}
