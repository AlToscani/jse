package com.example.jse.m05.s08.exercise;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		double area = Math.pow(this.radius, 2.0) * Math.PI;
		return area;
	}

	public double perimeter() {
		double perimeter = this.radius * 2 * Math.PI;
		return perimeter;
	}
}
