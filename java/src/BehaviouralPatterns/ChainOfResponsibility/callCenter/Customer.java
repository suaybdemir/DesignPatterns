package BehaviouralPatterns.ChainOfResponsibility.callCenter;

public interface Customer {

	public void askAQuestion();
	public void receiveAnswer(String answer);
}
