using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sol1
{
    public interface UniversityFactory
    {
        Course createCourse();
        Professor createProfessor();
        Schedule createSchedule();
        Syllabus createSyllabus();
    }
}
