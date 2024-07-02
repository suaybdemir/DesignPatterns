using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice1
{
    public class Student
    {
        protected string Name { get; set; }
        public string SchoolName { get; set; }

        protected Student(string Name,string SchoolName)
        {
            this.Name = Name;
            this.SchoolName = SchoolName;
        }
        
    }
}
