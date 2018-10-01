package com.Daniyah;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter()
    {
        return this.radius * 2 * Math.PI;
    }

}
