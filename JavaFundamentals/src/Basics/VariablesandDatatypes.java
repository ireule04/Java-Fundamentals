package Basics;

import java.awt.Point;

public class VariablesandDatatypes {
	
	public static void main(String[] args) {
		
		
		Point point1 = new Point(10,20);
		Point point2 = point1;
		
		System.out.println(point1.x + ":" + point1.y);
		System.out.println(point2.x + ":" + point2.y );
		
		point1.y = 25;
		System.out.println(point1.x + " : " + point1.y);
		System.out.println(point2.x + " : " + point2.y);
		
	}
	
	
}
