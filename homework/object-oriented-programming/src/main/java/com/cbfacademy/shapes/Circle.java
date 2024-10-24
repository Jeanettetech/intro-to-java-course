package com.cbfacademy.shapes;

public class Circle implements Enclosure {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;

	}

	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;

	}

	@Override
	public double area() {
		return Math.PI * radius * radius;

	}

}
