package conditions;

import java.util.Scanner;

public class SwitchStatementExample {
	

	public static void main(String[] args) {
		

			Scanner scanner = new Scanner(System.in);
			System.out.println("admin - Gets Full Access");
			System.out.println("subadmin - Gets acess to create/delete courses");
			System.out.println("testprep - Gets to create/delete tests");
			System.out.println("user-Gets acess to consume content");
			System.out.println("Enter Your choice: ");
			
			String user = scanner.nextLine();
			
			switch (user) {
				case"admin":
					System.out.println("Gets full Access");
					break;
			
				case"subadmin":
					System.out.println("Gets access to create/delete courses");
					break;
					
				case"testprep":
					System.out.println("Gets to create/delete tests");
					break;
					
				case"user":
					System.out.println("Gets access to consume content.");
					break;
					
				default:
					System.out.println("You are a trail user");
					break;
					
			}
			
			
		}

	}



