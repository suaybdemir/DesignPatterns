package CreationalPatterns.Singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getSingleton();
		Singleton singleton2 = Singleton.getSingleton();
		
		boolean isEqual = singleton == singleton2;

		System.out.println(isEqual);
	}

}
