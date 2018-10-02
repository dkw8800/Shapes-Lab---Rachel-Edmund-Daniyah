package com.Daniyah;

/**
 * The class is a circle creator
 */
public class Circle extends Shape {


 /* the field is naming the integer radius, which is used to calculate its area and perimeter*/
    private int radius;

    /* the constructor is public Circle and it initializes the circle's radius and type*/
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    /**
     * the methods find the area and perimeter of the circle with the given radius
     * @return the methods return the circle's area and perimeter
     */
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
