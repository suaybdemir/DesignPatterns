package CreationalPatterns.FactoryPattern.abstractFactory;

public class PhoneDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S8Factory s8factory = new S8Factory();
		Phone s8 = s8factory.getPhone("S8","2600mah",4,7);
		
		System.out.println("S8 -> \n"+s8);
		
		Note8Factory n8factory = new Note8Factory();
		Phone n8 = n8factory.getPhone("note8", "3000mah", 5, 8);
		
		System.out.println("Note8 -> \n"+n8);
		
	}

}
