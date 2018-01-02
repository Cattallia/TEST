package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testPrintArea() {
		Circle circle = new Circle();
		circle.setRadius(15);
		//circle.printArea();
		String testArea = circle.getArea();
		assertEquals("706.8583470577034", testArea);
	}
}
