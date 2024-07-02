package StructuralPatterns.adapter;

public class Buzdolabi implements ElektrikliEvAletleri{

	private int volt;
	
	public Buzdolabi()
	{
		this.volt = 220;
	}
	
	@Override
	public int prizeTakVeCalistir() {
		// TODO Auto-generated method stub
		System.out.println("Buzdolabi calisiyor");
		return volt;
	}

	
}
