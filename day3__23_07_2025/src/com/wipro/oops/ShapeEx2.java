package com.wipro.oops;

public class ShapeEx2 {
	String color;
    boolean filled;
	
    
    public ShapeEx2() {
	}


	public ShapeEx2(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
    
}
