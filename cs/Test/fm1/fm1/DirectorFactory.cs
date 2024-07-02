using creationalPatterns.fm1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CreationalPatterns.FactoryMethod
{
    public class DirectorFactory : IFactory
    {
        public Employee Create()
        {
            Director director = new Director(EmployeeRandomizer.CreateId(), EmployeeRandomizer.CreateName(),
                    EmployeeRandomizer.CreateYear(), "Management", "Management", 5000);
            return director;
        }
    }
}
