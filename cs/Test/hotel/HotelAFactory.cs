using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hotel
{
    public class HotelAFactory 
    {
        public static Hotel create()
        {
            return new HotelA();
        }
    }
}
