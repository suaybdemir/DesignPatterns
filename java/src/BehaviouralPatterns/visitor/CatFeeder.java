package BehaviouralPatterns.visitor;

public class CatFeeder implements Feeder{

	@Override
	public void feed(Animal a) {
		System.out.println("Feeding the cat " + a.getName());
	}

}
