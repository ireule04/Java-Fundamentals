package arrays;

import java.util.Iterator;

public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		
		//Declaring the array
//		int[] marks;
//		marks = new int[5];
		
		//OR
		
//		int[] marks = new int[5];
		
		//Initializing an array:
		
		
//		int[] marks = new int[] {10,20,30,40,50};
		
		//Declare and Asign
		
		int[] marks = new int[5];
		marks[0]=100;
		marks[1]=50;
		marks[2]=60;
		marks[3]=52;
		marks[4]=90;
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			
		}
		System.out.println("......................");
		
		for (int value : marks) {
			System.out.println(value);
			
		}
		
		
		
		
	}

}
