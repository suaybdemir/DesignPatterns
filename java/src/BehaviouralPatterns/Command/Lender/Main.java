package BehaviouralPatterns.Command.Lender;

public class Main {
	
	
	private Command borrower = new Borrower();
	private Command taxOffice = new TaxOffice();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lender lender = new Lender();
		lender.lend(null, 10);

	}

}
