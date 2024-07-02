using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hotel
{
    public class BTInfrastructure
    {
        public void system(Hotel hotel)
        {
            Console.WriteLine(hotel.GetName() + "'s reservation has sucesfully done!");
        }
    }
}
