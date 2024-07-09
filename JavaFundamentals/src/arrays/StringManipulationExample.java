package arrays;

public class StringManipulationExample {
	
	public static void main(String[] args) {
		
		//Using string literal
		String str1 = "Hello ";
		System.out.println(str1);
		
		//Using String Object
		String str2 = new String("World");
		System.out.println(str2);
		
		//Concatenating String and Literal and String Object
		String str3 = str1 + str2;
		System.out.println(str3);
		
		// String Method
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		System.out.println(str1.concat(str2));
		System.out.println(str3.substring(0, 7));
		System.out.println(str1.equals(str2));
		System.out.println(str3.contains("Hello"));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3.trim());
		
		
		
		
		
	}

}
