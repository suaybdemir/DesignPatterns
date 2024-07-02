package BehaviouralPatterns.state.door;

public interface DoorState {

	void open();
	
	void close();
	
	boolean isOpen();
}
