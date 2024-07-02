using System;
namespace Computer1
{
	public interface ComputerBuilderI
	{
		RAM buildRAM();
		CPU buildCPU();
		HardDrive buildHardDrive();
		GraphicCard buildGraphicCard();
		Display buildDisplay();
		Computer buildComputer();
	}
}

