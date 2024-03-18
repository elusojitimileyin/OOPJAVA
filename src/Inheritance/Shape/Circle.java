package Inheritance.Shape;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private  double Pi = PI;
    private int Radius;
    private  double length;
    public Circle(String color, double length ) {
        super(color);
        this.length = length;
    }

    @Override
    public double getArea() {
        return getLengthOfTheArcOfACircle();
    }

    private double getLengthOfTheArcOfACircle() {
        return 2*Pi*Radius;
    }
}
