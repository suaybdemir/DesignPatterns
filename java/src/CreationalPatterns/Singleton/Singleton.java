package CreationalPatterns.Singleton;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton()
	{
		System.out.println("Class has created");
	}
	
	
	public static Singleton getSingleton()
	{
		if(singleton == null)
		{
			singleton = new Singleton();
		}
		
		
		return singleton;
	}
}
