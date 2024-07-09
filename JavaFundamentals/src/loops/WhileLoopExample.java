package loops;

import java.util.Scanner;

public class WhileLoopExample {
	
	
	public static void main(String[] args) {
	
//	int i = 1;
//	while(i<=10) {
//		
//		System.out.println("Hello World : "+i);
//		i++;
//		}
		
		Scanner scanner = new Scanner(System.in);
		String input ="";
		while(!input.equals("quit")) {
			System.out.print("Enter Message: ");
			input = scanner.nextLine().toLowerCase();
			System.out.println(input);
		}

}
}
