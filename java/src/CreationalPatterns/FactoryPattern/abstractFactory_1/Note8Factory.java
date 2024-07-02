package CreationalPatterns.FactoryPattern.abstractFactory;

public class Note8Factory implements PhoneFactory{

	@Override
	public Phone getPhone(String model, String battery, int width, int height) {
		// TODO Auto-generated method stub
		return new Note8(model,battery,width,height);
	}

}
