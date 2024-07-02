using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fm4
{
    public class EmployeeRandomizer
    {

        private static readonly Random random = new Random();

        private static readonly string[] firstNames = { "Ali", "Ayse", "Bahar", "Bekir", "Bulent", "Can", "Cem", "Demet", "Elif",
            "Eylem", "Faruk", "Fatma", "Ganime", "Gulsum", "Haydar", "Halil", "Ismail", "Jale", "Kemal", "Leman",
            "Mehmet", "Mihrimah", "Murat", "Mustafa", "Nedim", "Nilufer", "Selim", "Selman", "Sevda", "S¸leyman",
            "Tarik", "Teoman", "Turgut", "Yeliz", "Zuhal" };

        private static readonly string[] departments = { "Production", "Sales", "Marketing", "Engineering" };

        public static int CreateId()
        {
            int randomInt = random.Next(100000);
            return randomInt;
        }

        public static string CreateName()
        {
            int randomInt = random.Next(35);
            return firstNames[randomInt];
        }

        public static string CreateDepartment()
        {
            int randomInt = random.Next(4);
            return departments[randomInt];
        }

        public static int CreateYear()
        {
            int randomInt = random.Next(20);
            return randomInt;
        }
    }
}
