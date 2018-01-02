package org.itstep;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Circle{

	private static Logger logger = Logger.getLogger(Circle.class.getName());
	private int radius;

	public void printArea() {
		logger.log(Level.INFO, "Aria of this circle is " + Math.PI * radius * radius + " sq.m.");
		// System.out.println("Aria of this circle is " + Math.PI*radius*radius + "
		// sq.m.");
	}

	public String getArea() {
		return String.valueOf(Math.PI * radius * radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}