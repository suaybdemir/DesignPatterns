using System;
namespace Facade.examp1
{
	public class Test
	{
		public static void Main(String[] args)
		{
            Customer duygu = new Customer("Duygu", "Kaya");

            CreditCardFacade creditCardFacade = new CreditCardFacade();
            creditCardFacade.CreateCreditCart(duygu);
        }
	}
}

