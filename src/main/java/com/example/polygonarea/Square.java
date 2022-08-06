package com.example.polygonarea;

public class Square extends Polygon{

    SquareAreaCalculator squareAreaCalculator;

    public Square(int length){
        this.squareAreaCalculator = new SquareAreaCalculator();
        this.squareAreaCalculator.setLength(length);
    }

    float calculateArea(){
        this.squareAreaCalculator.calculateArea();
        return 0;
    }


}
