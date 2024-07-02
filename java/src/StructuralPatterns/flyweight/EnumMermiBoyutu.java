package StructuralPatterns.flyweight;

public enum EnumMermiBoyutu {
	
	UC(3),
	BES(5),
	YEDI(7)
	;
	
	private int boyut;
	
	EnumMermiBoyutu(int boyut)
	{
		this.boyut = boyut;
	}
	
	public int getBoyut()
	{
		return boyut;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(boyut);
	}
	
	

}
