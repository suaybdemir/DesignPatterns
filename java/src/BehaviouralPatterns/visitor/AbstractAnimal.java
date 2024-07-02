package BehaviouralPatterns.visitor;

public abstract class AbstractAnimal implements Animal{
	private String name;

	public AbstractAnimal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
