package StructuralPatterns.adapter;

public class TelefonEEAAdapter implements ElektrikliEvAletleri{

	private Telefon telefon;
	
	
	public TelefonEEAAdapter(Telefon telefon) {
		this.telefon = telefon;
	}


	@Override
	public int prizeTakVeCalistir() {
		// TODO Auto-generated method stub
		return telefon.sarjzet();
	}

}
