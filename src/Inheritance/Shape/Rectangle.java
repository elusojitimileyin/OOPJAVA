package Inheritance.Shape;

public class Rectangle extends Shape{
    private double width;
    public double height;
    public Rectangle(String color,double width,double height) {
        super(color);
        this.width = width;
        this.height = height;


    }
}
