using creationalPatterns.fm1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CreationalPatterns.FactoryMethod
{
    public class ManagerFactory : IFactory
    {
        public Employee Create()
        {
            string department = EmployeeRandomizer.CreateDepartment();
            Manager manager = new Manager(EmployeeRandomizer.CreateId(), EmployeeRandomizer.CreateName(),
                EmployeeRandomizer.CreateYear(), department, department);
            return manager;
        }
    }
}
