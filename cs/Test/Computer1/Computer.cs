using System;
namespace Computer1
{
	public class Computer
	{
		public String name { get; set; }
		public CPU cpu { get; set; }
		public RAM ram { get; set; }
		public HardDrive hd { get; set; }
        public GraphicCard graphicCard { set; get; }
        public Display display { set; get; }
        public Keyboard keyboard { set; get; }
        public Mouse mouse { set; get; }



        public Computer()
		{
		}

		public Computer(String name, CPU cpu, RAM ram, HardDrive hd,GraphicCard graphicCard)
		{
			this.name = name;
			this.cpu = cpu;
			this.ram = ram;
			this.hd = hd;
			this.graphicCard = graphicCard;
			
		}
        public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard,Display display)
        {
            this.name = name;
            this.cpu = cpu;
            this.ram = ram;
            this.hd = hd;
            this.graphicCard = graphicCard;
			this.display = display;
        }
        public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display,Keyboard keyboard)
        {
            this.name = name;
            this.cpu = cpu;
            this.ram = ram;
            this.hd = hd;
            this.graphicCard = graphicCard;
            this.display = display;
            this.keyboard = keyboard;
        }
        public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard,
                Display display, Keyboard keyboard, Mouse mouse)
        {
            this.name = name;
            this.cpu = cpu;
            this.ram = ram;
            this.hd = hd;
            this.graphicCard = graphicCard;
            this.display = display;
            this.keyboard = keyboard;
            this.mouse = mouse;
        }

        public void Start()
        {
            cpu.start();
            ram.loadOSKernelImage();
            ram.loadDrivers();
            ram.startServices();
            hd.start();
            graphicCard.start();
            if(display != null)
            {
                display.start();
            }
            if(keyboard != null)
            {
                keyboard.start();
            }
            if(mouse != null)
            {
                mouse.start();
            }

            Console.WriteLine("Computer" + name + " has started.\n");
        }

    }
}

