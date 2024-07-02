package StructuralPatterns.adapter;

public class Priz {

	public void ElektrikVer(ElektrikliEvAletleri elektrikliEvAletleri)
	{
		int volt = elektrikliEvAletleri.prizeTakVeCalistir();
		System.out.println("Prizden "+volt+" volt aliniyor");
	}
}
