package StructuralPatterns.adapter.bridge.cihaz;

import StructuralPatterns.adapter.bridge.Muzik;
import StructuralPatterns.adapter.bridge.muzikcalar.MuzikCalar;
import StructuralPatterns.adapter.bridge.sescihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {

	protected SesCihazi sescihazi;
	protected MuzikCalar muzikCalar;
	
	public MuzikCalabilenBilgisayar()
	{
		
	}

	public MuzikCalabilenBilgisayar(SesCihazi sescihazi, MuzikCalar muzikCalar) {
		this.sescihazi = sescihazi;
		this.muzikCalar = muzikCalar;
	}
	
	void muzikCal(Muzik muzik)
	{
		String ses = muzikCalar.muzikCal(muzik);
		System.out.println(ses);
	}
	
	
}
