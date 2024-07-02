package StructuralPatterns.adapter.bridge.shape;

public class Square extends Shape {
	
	

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Square drawn. " + color.fill();
	}

	
}
