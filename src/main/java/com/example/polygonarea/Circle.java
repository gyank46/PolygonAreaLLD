package com.example.polygonarea;

public class Circle extends Polygon{

    int radius;
    CircleAreaCalculator circleAreaCalculator;

    public Circle(int radius){
        circleAreaCalculator=new CircleAreaCalculator();
        circleAreaCalculator.setRadius(radius);
    }

    float calculateArea(){
        return circleAreaCalculator.calculateArea();
    }

}
