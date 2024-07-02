using CreationalPatterns.FactoryMethod;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fm4
{
    public class Test
    {
        static void Main()
        {
            HR hr = new HR();
            PayrollOffice po = new PayrollOffice();

            hr.AddNewEmployee(EmployeeFactory.Create("Employee"));
            hr.AddNewEmployee(EmployeeFactory.Create("Emloyee"));
            hr.AddNewEmployee(EmployeeFactory.Create("Employee"));


            hr.ListEmployees();

            List<Employee> employees = hr.GetEmployees();

            foreach (Employee employee in employees)
            {
                po.PaySalary(employee);
            }
        }
    }
}
