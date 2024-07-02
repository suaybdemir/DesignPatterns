package CreationalPatterns.FactoryPattern.abstractFactory;

public class S8 implements Phone {

	private String model;
	private String battery;
	private int width;
	private int height;
	
	public S8(String model, String battery, int width, int height) {
		super();
		this.model = model;
		this.battery = battery;
		this.width = width;
		this.height = height;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "S8 [model=" + model + ", battery=" + battery + ", width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
}
