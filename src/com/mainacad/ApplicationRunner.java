package com.mainacad;

import com.mainacad.model.*;

public class ApplicationRunner {

    public static void main(String[] args) {

        Circle circle = new Circle(10);


        Square square = new Square(15);


        Triangle triangle = new Triangle(12, 15);

        Quadrilateral quadrilateral = new Quadrilateral(100,200);

        Shape maxShape;

        if (circle.getArea() > square.getArea()) {
            maxShape = circle;
        }
        else {
            maxShape = square;
        }

        if (maxShape.getArea() < triangle.getArea()){
            maxShape = triangle;
        }

        if (maxShape.getArea() < quadrilateral.getArea()){
            maxShape = quadrilateral;
        }

        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());
    }
}
