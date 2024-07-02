package StructuralPatterns.adapter.bridge.muzikcalar;

import StructuralPatterns.adapter.bridge.Muzik;

public class Fizy implements MuzikCalar {

	@Override
	public String muzikCal(Muzik muzik) {
		// TODO Auto-generated method stub
		System.out.println("Fizy "+muzik+" sarkisini caliyor");
		return muzik.getSes();
	}

}
