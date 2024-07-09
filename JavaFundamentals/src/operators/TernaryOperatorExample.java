package operators;

public class TernaryOperatorExample {
	
	public static void main(String[] args) {
		
		boolean isAuthenticatd = true;
		
		if(isAuthenticatd)
			System.out.println("You are logged in successfully.");
		else
			System.out.println("You are not logged in.");
		
		String result = (isAuthenticatd) ? 	"LoggedIn" : "Not LoggedIn";
		System.out.println(result);
		
		
	}

}
