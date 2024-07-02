package BehaviouralPatterns.Command.Account;

public interface TransactionFactory {
	
	public Transaction createWithdraw();
	
	public Transaction createDeposit();

}
