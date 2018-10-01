package com.Daniyah;

public class makeACircle extends Shape {
    private int radius;

    public makeACircle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter()
    {
        return radius*2*Math.PI;
    }

}
