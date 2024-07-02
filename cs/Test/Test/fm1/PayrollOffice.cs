using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CreationalPatterns.FactoryMethod
{
    public class PayrollOffice
    {
        public void PaySalary(Employee employee)
        {
            string name = employee.name;
            string department = employee.department;
            double salary = employee.CalculateSalary();

            Console.WriteLine("Paying " + salary + " to " + " " + name + " in " + department);
        }
    }
}
