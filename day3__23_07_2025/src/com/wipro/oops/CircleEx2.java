package com.wipro.oops;

public class CircleEx2 {
double radius;
	
	public CircleEx2(String color, double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [Radius=" + radius + ", " + super.toString() + "]";
    }
}
