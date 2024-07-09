package Basics;

public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		/*
		int intValue = 100;
		
		//implicit type casting from int to long
		long longValue = intValue;
		//implicit type casting from long to double
		double doubleValue = longValue;
		
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		*/
		
		double doubleValue = 200.56;
		
		//Explicit type casting from double to int
		int intValue = (int)doubleValue;
		//Explicit type casting from int to byte
		byte byteValue = (byte)intValue;
		
		
		
		
		System.out.println(doubleValue);
		System.out.println(intValue);
		
		
		
		
	}

}
