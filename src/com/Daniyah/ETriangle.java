package com.Daniyah;

public class ETriangle extends Shape {
    private int side;

    public ETriangle (int side) {
        super("ETriangle");
        this.side = side;
    }

    @Override
    public double getArea () {
        return this.side * this.side / 2;
    }

    @Override
    public double getPerimeter () {
        return this.side * 3;
    }
}
