package com.example.polygonarea;

import com.example.Builder.Mobile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolygonAreaApplication {

    public static void main(String[] args) {

        Square s = new Square(2);
//        s.setAreaCalculator(new SquareAreaCalculator(2));
        s.calculateArea();

        Rectangle r = new Rectangle(3,4);
//        r.setAreaCalculator(new RectangleAreaCalculator(3,4));
        r.calculateArea();

        Triangle t = new Triangle(5,6);
//        t.setAreaCalculator(new TriangleAreaCalculator(5,6));
        t.calculateArea();

        Circle c = new Circle(6);
        c.calculateArea();

        Parallelogram p = new Parallelogram(8,6);
        p.calculateArea();

        SpringApplication.run(PolygonAreaApplication.class, args);


    }

}
