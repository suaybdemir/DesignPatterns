package StructuralPatterns.flyweight;

public class Mermi {

	private EnumMermiBoyutu mermiBoyutu;

	public Mermi(EnumMermiBoyutu mermiBoyutu) {
		
		this.mermiBoyutu = mermiBoyutu;
		
		System.out.println(mermiBoyutu.getBoyut() + " mm mermi olustu");
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public void atesle()
	{
		System.out.println("Tak");
	}
	
}
