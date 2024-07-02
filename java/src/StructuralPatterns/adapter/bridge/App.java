package StructuralPatterns.adapter.bridge;

import StructuralPatterns.adapter.bridge.cihaz.BilgisayarKF;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Muzik muzik = new Muzik("Sezen Aksu - Gulumse ","Gulumse bakalim");
//		
//		
//		Bilgisayar pc = new Bilgisayar();
//		
//		pc.muzikCal(muzik);
		
		Muzik muzik = new Muzik("Sezen Aksu - Gulumse ","Gulumse bakalim");
		
		BilgisayarKF bkf = new BilgisayarKF();
		bkf.muzikCal(muzik);
	
	}

}
