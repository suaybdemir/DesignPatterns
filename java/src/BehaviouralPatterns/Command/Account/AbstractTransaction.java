package BehaviouralPatterns.Command.Account;

import java.util.List;

public abstract class AbstractTransaction implements Transaction {

	protected Account account;
	protected int amount;
	
	public AbstractTransaction()
	{
		
	}
	
	@Override
	public void redo()
	{
		execute(amount);
	}
	
	@Override
	public List<Transaction> getTransactions()
	{
		return account.getTransactions();
	}
	
	@Override
	public void setAccount(Account account)
	{
		this.account = account;
	}
	
	@Override
	public String toString()
	{
		return getClass().getName() + account + " [account=" + account + ", amount=" + amount +"]";
	}
}
