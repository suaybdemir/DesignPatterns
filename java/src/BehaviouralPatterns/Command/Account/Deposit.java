package BehaviouralPatterns.Command.Account;

public class Deposit extends AbstractTransaction{

	@Override
	public void execute(int amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
		account.deposit(amount);
		account.addTransaction(this);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		try
		{
			account.withdraw(amount);
		}
		catch(NotEnoughBalanceException e)
		{
			System.out.println("Can't withdraw: "+e.getMessage());
		}
		
		account.addTransaction(this);
	}

	
}
