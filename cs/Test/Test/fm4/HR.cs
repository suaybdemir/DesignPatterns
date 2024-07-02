using CreationalPatterns.FactoryMethod;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace creationalPatterns.fm4
{
    public class HR
    {
        private List<Employee> employees = new List<Employee>();

        public List<Employee> GetEmployees()
        {
            return employees;
        }

        public int GetNumberOfEmployees()
        {
            return employees.Count;
        }

        public void AddNewEmployee(Employee employee)
        {
            employees.Add(employee);
        }

        public void ListEmployees()
        {
            Console.WriteLine("All Employees");
            foreach (Employee employee in employees)
            {
                Console.WriteLine(employee);
            }
        }
    }
}
