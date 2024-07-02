package StructuralPatterns.adapter.bridge.cihaz;

import StructuralPatterns.adapter.bridge.Muzik;
import StructuralPatterns.adapter.bridge.muzikcalar.Fizy;
import StructuralPatterns.adapter.bridge.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {

	public BilgisayarKF() {
		sescihazi = new Kulaklik();
		muzikCalar = new Fizy();
	}

	@Override
	public void muzikCal(Muzik muzik) {
		// TODO Auto-generated method stub
		
		System.out.println("Bilgisayar calisti");
		super.muzikCal(muzik);
	}

	
}
