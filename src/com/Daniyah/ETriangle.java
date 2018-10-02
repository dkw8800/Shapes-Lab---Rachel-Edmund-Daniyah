package com.Daniyah;

/**
 * Represents a shape called an equilateral triangle.
 *
 * @author Edmund Wu
 */
public class ETriangle extends Shape {
    /**
     * The side length of the triangle.
     */
    private int side;

    /* the constructor is public ETriangle and it initializes the triangle's side*/

    /**
     * Creates an equilateral triangle with the specified side length.
     *
     * @param side the side length of the triangle
     */
    public ETriangle (int side) {
        super("ETriangle");
        this.side = side;
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return the area
     */
    @Override
    public double getArea () {
        return Math.sqrt(3) / 4 * Math.pow(this.side, 2);
    }

    /**
     * Calculates the perimeter of the triangle.
     *
     * @return the perimeter
     */
    @Override
    public double getPerimeter () {
        return this.side * 3;
    }
}
