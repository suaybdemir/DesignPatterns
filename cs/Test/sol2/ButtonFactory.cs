﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sol1
{
    public class ButtonFactory : GUIFactory
    {
        public Component create()
        {
            return new Button();
        }
    }
}
