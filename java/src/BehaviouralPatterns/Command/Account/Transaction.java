package BehaviouralPatterns.Command.Account;

import java.util.List;

public interface Transaction {
	public void execute(int amount);
	public void undo();
	public void redo();
	public List<Transaction>getTransactions();
	public void setAccount(Account account);
}
