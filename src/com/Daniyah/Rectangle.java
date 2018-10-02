package com.Daniyah;

/**
 * Represents a shape called a rectangle.
 *
 * @author Rachel
 */
public class Rectangle extends Shape {
    /**
     * The height of the rectangle.
     */
    private int height;

    /**
     * The width of the rectangle.
     */
    private int width;

    /* the constructor is public Rectangle and it initializes the rectangle's height and width*/

    /**
     * Creates a rectangle with dimensions height and width.
     *
     * @param height the height of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area
     */
    @Override
    public double getArea()
    {
        return this.height * this.width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the perimeter
     */
    @Override
    public double getPerimeter()
    {
        return this.height * 2 + this.width * 2;
    }
}
