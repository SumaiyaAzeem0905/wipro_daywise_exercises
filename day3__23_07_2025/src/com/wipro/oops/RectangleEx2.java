package com.wipro.oops;

public class RectangleEx2 {
	double length;
    double width;
//
//    public RectangleEx2(String color, double length, double width) {
//        super();
//        this.length = length;
//        this.width = width;
//    }

    public RectangleEx2(String color, int length2, int width2) {
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle [Length=" + length + ", Width=" + width + ", " + super.toString() + "]";
    }

}
