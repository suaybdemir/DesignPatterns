package StructuralPatterns.adapter;

public class Utu implements ElektrikliEvAletleri{

	private int volt;
	
	public Utu()
	{
		this.volt = 220;
	}
	
	@Override
	public int prizeTakVeCalistir() {
		// TODO Auto-generated method stub
		System.out.println("Utu calisiyor");
		return volt;
	}

	
}
