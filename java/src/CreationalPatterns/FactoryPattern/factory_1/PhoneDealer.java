package CreationalPatterns.FactoryPattern;

public class PhoneDealer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone s8 = PhoneFactory.getPhone("s8","2600mah",4,7);
		Phone note8 = PhoneFactory.getPhone("note8","3000mah",5,8);
		
		System.out.println("s8s' phone features");
		System.out.println(s8);
		
		System.out.println("note8s' phone features");
		System.out.println(note8);
	}
}
