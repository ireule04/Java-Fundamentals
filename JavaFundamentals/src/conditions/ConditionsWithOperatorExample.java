package conditions;

public class ConditionsWithOperatorExample {
	
	public static void main(String[] args) {
		
	
	
	boolean isLoggedIn = true;
	boolean isEmailVerified = false;
	boolean isCardInfoValid = true;
	
	if(isLoggedIn && isEmailVerified && isCardInfoValid)
		System.out.println("You are allowed to make a purchase");
	else 
		System.out.println("You are not allowed to make a purchase.");
	
	if(isLoggedIn) {
		if(isEmailVerified) {
			if(isCardInfoValid) {
				System.out.println("Your are allowed to make purchase.");
			}
		}
		
	}
	
	}

}
