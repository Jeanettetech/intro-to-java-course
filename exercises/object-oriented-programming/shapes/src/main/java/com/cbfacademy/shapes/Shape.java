package com.cbfacademy.shapes;

abstract class Shape {

	protected String name;

	abstract double getArea();

	public String getname() {
		return this.name;
	}

}