package BehaviouralPatterns.Command.Account;

public class CheckingAccountFactory extends AccountFactory {
	private static CheckingAccountFactory factory = new CheckingAccountFactory();

	@Override
	public Account createAccount(int amount) {
		return new CheckingAccount(amount);
	}

	public static CheckingAccountFactory getInstance() {
		return factory;
	}
}
