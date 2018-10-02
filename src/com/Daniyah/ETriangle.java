package com.Daniyah;

/**
 * this class is the triangle creator
 */
public class ETriangle extends Shape {
    /*the field is naming the integer side, which is used to calculate its area and perimeter*/
    private int side;

    /* the constructor is public ETriangle and it initializes the triangle's side*/
    public ETriangle (int side) {
        super("ETriangle");
        this.side = side;
    }

    /**
     * the methods find the area and perimeter of the triangle with the given side
     * @return the methods return the triangle's area and perimeter
     */
    @Override
    public double getArea () {
        return Math.sqrt(3) / 4 * Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter () {
        return this.side * 3;
    }
}
