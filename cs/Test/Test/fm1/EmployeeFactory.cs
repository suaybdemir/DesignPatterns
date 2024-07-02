using creationalPatterns.fm1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CreationalPatterns.FactoryMethod
{
    public class EmployeeFactory : IFactory
    {
        public Employee Create()
        {
            Employee employee = new Employee(EmployeeRandomizer.CreateId(), EmployeeRandomizer.CreateName(),
                EmployeeRandomizer.CreateYear(), EmployeeRandomizer.CreateDepartment());
            return employee;
        }
    }
}
