using System;
namespace Decorator.examp1
{
	public interface IDataSource
	{
		string GetFileName();
		void WriteData(object data);
		void ReadData();
	}
}

