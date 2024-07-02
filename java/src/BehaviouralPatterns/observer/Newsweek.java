/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.observer;

import java.util.Iterator;

/**
 *
 * @author ubuntu
 */
public class Newsweek extends AbstractPublication {
    public Newsweek(String name) {
		super(name);
	}
	
	public void publish(String date) {
		name = name + " - " + date;
		Iterator<Subscriber> iterator = subscribers.iterator();
		while(iterator.hasNext()) {
			Subscriber subscriber = iterator.next();
			subscriber.receive(this);
		}
	}

    @Override
    public void addSubscriber(Subscriber subscriber) {
        super.addSubscriber(subscriber);
    }

   
}
