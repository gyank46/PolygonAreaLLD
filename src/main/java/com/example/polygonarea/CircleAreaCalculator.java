package com.example.polygonarea;
import java.lang.Math;

public class CircleAreaCalculator implements AreaCalculator {

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    int radius;


    @Override
    public float calculateArea() {
        System.out.println("calculating Circle Area: " + Math.PI*radius*radius);
        return 0;
    }
}
