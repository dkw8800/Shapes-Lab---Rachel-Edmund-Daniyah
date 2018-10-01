package com.Daniyah;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter()
    {
        return this.height * 2 + this.width * 2;
    }
}
