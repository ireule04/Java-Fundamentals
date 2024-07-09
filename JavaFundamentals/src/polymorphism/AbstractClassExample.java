package polymorphism;

abstract class ABCBank{
	
	public static void message() {
		System.out.println("Welcome to ABC Bank");
	}
	abstract void OpenAccount();
	abstract void closeAccount();
	
}

abstract class BankAccount extends ABCBank{
	
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
		
	
}

class SavingAccount extends BankAccount{

	@Override
	void OpenAccount() {
		System.out.println("Open Account");
	}

	@Override
	void closeAccount() {
		System.out.println("Close Account");
		
	}

	@Override
	void deposit() {
		System.out.println("Deposit in Saving Account");
		
	}

	@Override
	void withdraw() {
		
		System.out.println("Withdraw from Saving account");
	}

	@Override
	void balance() {
		
		System.out.println("Balance in saving account");
	}
	
	
}

class CurrentAccount extends BankAccount{
	
	
	@Override
	void OpenAccount() {
		System.out.println("Open Account");
	}

	@Override
	void closeAccount() {
		System.out.println("Close Account");
		
	}

	@Override
	void deposit() {
		System.out.println("Deposit in Current Account");
		
	}

	@Override
	void withdraw() {
		
		System.out.println("Withdraw from Current account");
	}

	@Override
	void balance() {
		
		System.out.println("Balance in Current account");
	}
	
}

public class AbstractClassExample {
	
	public static void main(String[] args) {
		
		
		ABCBank.message();//from static in abc class
		
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.message();//from the message of ABC class
		savingAccount.OpenAccount();
		savingAccount.closeAccount();
		savingAccount.deposit();
		savingAccount.withdraw();
		savingAccount.balance();
		
		System.out.println("===========================");
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.deposit();
		currentAccount.withdraw();
		currentAccount.balance();
		currentAccount.OpenAccount();
		currentAccount.closeAccount();
		
	}

}
