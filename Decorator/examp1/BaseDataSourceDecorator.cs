using System;
namespace Decorator.examp1
{
	public abstract class BaseDataSourceDecorator : IDataSource
	{
        protected IDataSource dataSource;

		public BaseDataSourceDecorator(IDataSource dataSource)
		{
            this.dataSource = dataSource;
		}

        public abstract string GetFileName();

        public abstract void ReadData();

        public abstract void WriteData(object data);
    }
}

