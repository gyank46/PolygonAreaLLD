package com.example.polygonarea;

public class Parallelogram extends Polygon{
    RectangleAreaCalculator parallelogramAreaCalculator;

    public Parallelogram(int base, int height){
        parallelogramAreaCalculator = new RectangleAreaCalculator();
        parallelogramAreaCalculator.setLength(base);
        parallelogramAreaCalculator.setBreadth(height);
    }

    float calculateArea(){
        return parallelogramAreaCalculator.calculateArea();
    }
}
