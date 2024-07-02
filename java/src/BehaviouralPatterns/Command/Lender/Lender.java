package BehaviouralPatterns.Command.Lender;

public class Lender {
	
	public void lend(Command command,int money)
	{
		command.execute(money);
	}
}
