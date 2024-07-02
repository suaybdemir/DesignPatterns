using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hotel
{
    public class Test
    {
        static void Main(string[] args)
        { 
            BTInfrastructure bti = new BTInfrastructure();
            Hotel hotelA = HotelAFactory.create();
            
            bti.system(hotelA);

        }
    }
}
