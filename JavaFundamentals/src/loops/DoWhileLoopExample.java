package loops;

import java.util.Scanner;

public class DoWhileLoopExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("Enter Message: ");
			input = scanner.nextLine().toLowerCase();
			System.out.println(input);
			
		}while(!input.equals("quit"));
		
		
		
	}

}
