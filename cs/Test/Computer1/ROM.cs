using System;
namespace Computer1
{
	public class ROM
	{

		private int size;
		public ROM(int size)
		{
			this.size = size;
		}

		public byte[] GetOSKernelImage()
		{
            Console.WriteLine("ROM: Loading the image of OS kernel.");
            byte[] kernelImage = new byte[2 * 1024 * 1024];

            // ...

            return kernelImage;
        }
	}
}

