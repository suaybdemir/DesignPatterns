using System;
namespace Computer1
{
	public class RAM
	{
		public RAM()
		{
		}

		public void loadOSKernelImage()
		{
			Console.WriteLine("OS Kernel Image has been loading");
		}

		public void loadDrivers()
		{
			Console.WriteLine("Drivers has been loading");
		}

		public void startServices()
		{
			Console.WriteLine("Services are loading");
		}
	}
}

