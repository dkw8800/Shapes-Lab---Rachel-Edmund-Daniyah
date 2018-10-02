package com.Daniyah;

/**
 * this class is the rectangle creator
 */
public class Rectangle extends Shape {
    /* the fields are the integers height and width*/
    private int height;
    private int width;

    /* the constructor is public Rectangle and it initializes the rectangle's height and width*/
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    /**
     * the methods find the area and perimeter of the rectangle with the given height and width
     * @return the methods return the rectangle's area and perimeter
     */

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
