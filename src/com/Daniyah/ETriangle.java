package com.Daniyah;

public class ETriangle extends Shape {
    private int side;

    public ETriangle (int side) {
        super("ETriangle");
        this.side = side;
    }

    @Override
    public double getArea () {
        return Math.sqrt(3) / 4 * Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter () {
        return this.side * 3;
    }
}
