internal class Program
{
    class CPU
    {
        public void freeze()
        {
            Console.WriteLine("CPU: freeze");
        }

        public void jump(long position)
        {
            Console.WriteLine("CPU: jump to "+position);
        }

        public void execute()
        {

            Console.WriteLine("CPU: execute");
        }
    }
    class Memory
    {
        public void load(long position, byte[] data)
        {
            Console.WriteLine("Memory: load to " + position);
        }
    }
    class HardDrive
    {
        public byte[] read(long lba, int size)
        {
            Console.WriteLine("HardDrive: read from " + lba);
            return new byte[0];
        }
    }

    class ComputerFacade
    {

        private CPU cpu;
        private Memory memory;
        private HardDrive hardDrive;

        public ComputerFacade()
        {
            cpu = new CPU();
            memory = new Memory();
            hardDrive = new HardDrive();
        }


        public void start()
        {
            cpu.freeze();
            memory.load(0, hardDrive.read(0, 0));
            cpu.jump(0);
            cpu.execute();
        }
    }

    private static void Main(string[] args)
    {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}