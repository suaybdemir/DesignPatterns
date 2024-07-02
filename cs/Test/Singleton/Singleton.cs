
using System.Runtime.CompilerServices;

namespace singleton
{
    public class Singleton
    {
        private static void Main(string[] args)
        {
            var customerManager = CustomerManager.CreateAsSingleton();
            customerManager.Save();
        }
    }

    class CustomerManager
    {
        private static CustomerManager _customerManager;
        static object _lockObject = new object();
        private CustomerManager() 
        {
            
        
        }

        public static CustomerManager CreateAsSingleton()
        {


            //Thread Safe Singleton. If 2 users attempt to use the same object simultaneously, it could lead to significant issues.
            lock(_lockObject)
            {
                if (_customerManager == null)
                {
                    _customerManager = new CustomerManager();
                }
            }


            //Basic Singleton
            //if(_customerManager == null )
            //{
            //    _customerManager = new CustomerManager();
            //}
            return _customerManager;
        }

        public void Save()
        {
            Console.WriteLine("Saved!");
        }
    }
}

