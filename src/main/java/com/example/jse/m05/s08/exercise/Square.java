package com.example.jse.m05.s08.exercise;

public class Square {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double area() {
		double area = Math.pow(this.side, 2);
		return area;
	}

	public double perimeter() {
		double perimeter = this.side * 4;
		return perimeter;
	}
}
