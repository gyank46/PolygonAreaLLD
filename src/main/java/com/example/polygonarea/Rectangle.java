package com.example.polygonarea;

public class Rectangle extends Polygon{

    int length;
    int breadth;

    RectangleAreaCalculator rectangleAreaCalculator;
    public Rectangle(int length, int breadth){
        rectangleAreaCalculator = new RectangleAreaCalculator();
        rectangleAreaCalculator.setBreadth(breadth);
        rectangleAreaCalculator.setLength(length);
        this.length=length;
        this.breadth=breadth;
    }

    float calculateArea(){
        this.rectangleAreaCalculator.calculateArea();
        return 0;
    }


}
