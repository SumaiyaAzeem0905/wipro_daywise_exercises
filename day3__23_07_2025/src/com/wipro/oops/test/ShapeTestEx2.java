package com.wipro.oops.test;

import com.wipro.oops.CircleEx2;
import com.wipro.oops.RectangleEx2;
import com.wipro.oops.SquareEx2;

public class ShapeTestEx2 {
	public static void main(String[] args) {
        CircleEx2 circle = new CircleEx2("Red", 5);
        RectangleEx2 rectangle = new RectangleEx2("Blue", 4, 6);
        SquareEx2 square = new SquareEx2("Green", 4);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
