package BehaviouralPatterns.Command.Account;

public class NotEnoughBalanceException extends Exception {
	private static String description = "Account does not have enough balance: Balance: ";
	
	public NotEnoughBalanceException(int balance, int amount){
		super(description + balance + " Amount: " + amount);
	}

}
