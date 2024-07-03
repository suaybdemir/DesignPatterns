using System;
namespace Decorator.examp1
{
	public class FileDataSource : IDataSource
	{
        private string _fileName;

		public FileDataSource(string fileName)
		{
            _fileName = fileName;
		}

        public string GetFileName()
        {
            return _fileName;
        }

        public void ReadData()
        {
            Console.WriteLine($"{_fileName} readed.");
        }

        public void WriteData(object data)
        {
            Console.WriteLine($"data was written to {_fileName}.");
        }
    }
}

