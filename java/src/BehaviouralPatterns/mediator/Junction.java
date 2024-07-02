package BehaviouralPatterns.mediator;

public class Junction {
    
        private String name;
	private boolean busy;
    
	Junction(String name)
	{
		this.name = name;
		busy = false;
		System.out.println("Junction " + name + " created.");
	}
        
        public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}
	
	public String getName()
	{
		return name;
	}
}
