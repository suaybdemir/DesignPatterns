using System;
namespace Facade.examp1
{
    class CreditCardFacade
    {
        public void CreateCreditCart(Customer customer)
        {
            CreditCardManager creditCardManager = new CreditCardManager(); ;
            BlackListService blackListService = new BlackListService();

            if (blackListService.CheckEmployeeIsTheBlackList(customer))
            {
                creditCardManager.CreateCreditCart(customer);
            }
        }
    }
}

