package com.advancedjava;

import com.advancedjava.*;
import java.util.HashMap;

class Square {

	int sideLength;

	public Square(int sideLength) {
		this.sideLength = sideLength;
	}

	public int calculateArea() {
		return sideLength * sideLength;
	}
}

@FunctionalInterface
interface Shapes{
	public abstract  int getArea(Square person);
}


public class Ex9MethodReference {

	public static void main(String[] args) {
		Square s = new Square(4);
		Shapes shapes = ((square) -> {
			return square.calculateArea(); //To change body of generated lambdas, choose Tools | Templates.
		});

		Shapes altShapes = Square::calculateArea;

		System.out.println(shapes.getArea(s));
		System.out.println(altShapes.getArea(s));

		
	}

}
