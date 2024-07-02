package StructuralPatterns.adapter.bridge;

public class Spotify {

	public String muzikCal(Muzik muzik)
	{
		System.out.println("Spotify "+muzik+" sarkisini caliyor.");
		
		return muzik.getSes();
	}
}
