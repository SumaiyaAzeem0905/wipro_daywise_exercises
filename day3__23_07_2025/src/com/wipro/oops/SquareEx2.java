package com.wipro.oops;

public class SquareEx2 {
	private double side;

    public SquareEx2(String color, double side) {
        super(); 
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setArea(side * side);
    }

    private void setArea(double d) {
		
	}

	@Override
    public String toString() {
        return "Square [side=" + side + ", " + super.toString() + "]";
    }
}
