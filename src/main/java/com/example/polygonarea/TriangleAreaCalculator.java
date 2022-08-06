package com.example.polygonarea;

public class TriangleAreaCalculator implements  AreaCalculator{

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int base;
    int height;


    @Override
    public float calculateArea() {
        System.out.println("calculating Triangle Area" + 0.5*base*height);
        return 0;
    }
}
