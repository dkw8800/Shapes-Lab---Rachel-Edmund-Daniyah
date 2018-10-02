package com.Daniyah;

/**
 * Represents a shape called a circle.
 *
 * @author Daniyah
 */
public class Circle extends Shape {
    /**
     * The radius of the circle.
     */
    private int radius;

    /**
     * Creates a circle with the specified radius.
     *
     * @param radius the radius of the circle
     * @see          Circle
     */
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle
     */
    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Calculates the "perimeter" or circumference of the circle.
     *
     * @return the circumference of the circle
     */
    @Override
    public double getPerimeter()
    {
        return this.radius * 2 * Math.PI;
    }

}
