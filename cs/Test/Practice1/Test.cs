using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice1
{
    public class Test
    {
        static void Main(string[] args)
        {
            Student regularStudent = StudentFactory.Create("regular", "Ali");
            Console.WriteLine("School -> "+ regularStudent.SchoolName+"\n");

            Student onlineStudent = StudentFactory.Create("online", "Fatma");
            Console.WriteLine("Online School -> "+onlineStudent.SchoolName+"\n " );
        }
    }
}
