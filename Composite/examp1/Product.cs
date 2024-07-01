using System;
namespace Composite.examp1
{
	public class Product : ICatalogComponent
	{
        private string _name;

        public Product(string name)
        {
            _name = name;
        }

        public void DrawHierarchy()
        {
            Console.WriteLine(_name);
        }
    }
}
}

