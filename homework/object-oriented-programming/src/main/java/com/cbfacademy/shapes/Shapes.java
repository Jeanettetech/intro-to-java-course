package com.cbfacademy.shapes;

import java.util.ArrayList;
import java.util.List;

public class Shapes {

	public static void main(String[] args) {
		List<Enclosure> shapes = new ArrayList<>();

		shapes.add(new Square(20));
		shapes.add(new Square(4));
		shapes.add(new Square(12));
		shapes.add(new Circle(15));
		shapes.add(new Circle(10));
		shapes.add(new Circle(5));

		double totalArea = Shapes.computeArea(shapes);
		double totalPerimeter = Shapes.computePerimeter(shapes);

		System.out.println("Total Area " + totalArea);
		System.out.println("Total Perimeter " + totalPerimeter);

	}

	public static double computeArea(List<Enclosure> shapes) {
		double totalArea = 0;
		for (Enclosure shape : shapes) {
			totalArea += shape.area();
		}
		return totalArea;
	}

	public static double computePerimeter(List<Enclosure> shapes) {
		double totalPerimeter = 0;
		for (Enclosure shape : shapes) {
			totalPerimeter += shape.area();
		}
		return totalPerimeter;
	}

}
