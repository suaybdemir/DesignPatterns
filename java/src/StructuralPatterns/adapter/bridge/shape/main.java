package StructuralPatterns.adapter.bridge.shape;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square = new Square(new Red());
		
		System.out.println(square.draw());
	}

	
}
