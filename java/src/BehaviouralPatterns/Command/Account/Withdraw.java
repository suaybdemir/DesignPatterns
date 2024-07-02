package BehaviouralPatterns.Command.Account;

public class Withdraw extends AbstractTransaction{

	@Override
	public void execute(int amount) {
		// TODO Auto-generated method stub
		this.amount = amount;

		try
		{
			account.withdraw(amount);
		}
		catch(NotEnoughBalanceException e )
		{
			System.out.println("Can't withdraw: " + e.getMessage());
		}
		
		account.addTransaction(this);
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		account.deposit(amount);
		account.addTransaction(this);
	}
	
	

}
