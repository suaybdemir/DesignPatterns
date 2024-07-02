package CreationalPatterns.FactoryPattern.abstractFactory;

public class S8Factory implements PhoneFactory{

	@Override
	public  Phone getPhone(String model, String battery, int width, int height) {
		// TODO Auto-generated method stub
		return new S8(model,battery,width,height);
	}

}
