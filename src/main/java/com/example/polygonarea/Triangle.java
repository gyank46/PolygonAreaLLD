package com.example.polygonarea;

public class Triangle extends Polygon {

    int base;
    int height;

    TriangleAreaCalculator triangleAreaCalculator;
    public Triangle(int base, int height){
        this.triangleAreaCalculator = new TriangleAreaCalculator();
        triangleAreaCalculator.setBase(base);
        triangleAreaCalculator.setHeight(height);
        this.base=base;
        this.height=height;
    }

    float calculateArea(){
        this.triangleAreaCalculator.calculateArea();
        return 0;
    }


}
