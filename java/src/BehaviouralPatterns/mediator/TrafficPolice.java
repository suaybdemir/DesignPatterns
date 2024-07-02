package BehaviouralPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class TrafficPolice implements TrafficMediator {
	
	public String name;
	private Junction junction;
	private List<Vehicle> vehicles;

	public TrafficPolice(String name,Junction junction) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.junction = junction;
		vehicles = new ArrayList<>();
		System.out.println("TrafficPolice " + name + " created.");
	}
	
	@Override
	public void receive(Vehicle vehicle) {
		// TODO Auto-generated method stub
                vehicle.stopp();
		vehicles.add(vehicle);
		
	}
        
	@Override
	public void askPermitToPass(Vehicle vehicle) {
		// TODO Auto-generated method stub
                if (!junction.isBusy()) {
			junction.setBusy(true);
			vehicle.proceed();
		} else
			vehicle.waitForAWhile();
		
	}
	@Override
	public void done(Vehicle vehicle) {
		// TODO Auto-generated method stub
                vehicles.remove(vehicle);
		junction.setBusy(false);
		
	}

	
}
