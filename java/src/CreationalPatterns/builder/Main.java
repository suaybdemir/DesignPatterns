package CreationalPatterns.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ev ev1 = new Ev();
//		ev1.setIl("İstanbul");
//        ev1.setIlce("Ataşehir");
//        ev1.setMahalle("Atatürk");
//        ev1.setOdaSayisi(3);
//        ev1.setBinaYili(2010);
//        ev1.setHasKlima(true);
//        
//        Ev ev2 = new Ev("İstanbul", "Ümraniye", "Tatlısu", 2008, 2, 3, 2, 0, false,
//                false, true, true, true, false);
		
		Ev ev1 = EvBuilder.startNormalEvBuild("İstanbul", "Ümraniye", "Tatlısu", 2008, 3)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .build();

        Ev ev2 = EvBuilder.startHavuzluEvBuild("İstanbul", "Ataşehir", "Atatürk", 2010, 4)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .build();

        printEv(ev1);

        printEv(ev2);
	}
	
	private static void printEv(Ev ev){

        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();
    }

}
