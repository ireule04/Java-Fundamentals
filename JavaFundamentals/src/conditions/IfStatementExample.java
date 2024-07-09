package conditions;

public class IfStatementExample {
	
	public static void main(String[] args) {
		
		
		boolean inAuthenticated = true;
		
		if(inAuthenticated)
			System.out.println("LoggedIn");
		if(!inAuthenticated)
			System.out.println("Not Logged In");
	}

}
