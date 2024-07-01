using System;
namespace Decorator.examp1
{
	public class ComporessionDecorator : BaseDataSourceDecorator
	{
		public ComporessionDecorator(IDataSource dataSource) : base(dataSource)
		{
		}

        public override string GetFileName()
        {
            return base.dataSource.GetFileName();
        }

        public override void ReadData()
        {
            base.dataSource.ReadData();
        }

        public override void WriteData(object data)
        {
            Console.WriteLine("Data compressed.");

            Console.WriteLine($"Compressed data was written to {base.dataSource.GetFileName()}.");
        }
    }
}

