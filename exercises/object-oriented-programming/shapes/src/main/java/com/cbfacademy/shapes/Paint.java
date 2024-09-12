package com.cbfacademy.shapes;

public class Paint {
	protected double coverage;

	public Paint(double coverage) {
		this.coverage = coverage;

	}

	public double getAmount(Shape shape) {
		return this.coverage;
	}
}
