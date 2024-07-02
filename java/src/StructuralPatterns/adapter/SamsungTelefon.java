package StructuralPatterns.adapter;

public class SamsungTelefon implements Telefon{

	private int calismaVoltaji;
	
	public SamsungTelefon()
	{
		calismaVoltaji = 5;
	}

	@Override
	public int sarjzet() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Telefon Calisiyor.");
		return calismaVoltaji;
	}
}
