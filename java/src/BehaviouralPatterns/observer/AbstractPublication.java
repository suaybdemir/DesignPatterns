/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public abstract class AbstractPublication implements Publication{
    
    protected String name;
    protected List<Subscriber> subscribers;
    
    protected AbstractPublication(String name)
    {
        this.name = name;
        subscribers = new ArrayList<Subscriber>();
    }
    
    @Override
    public String getName() {
            return name;
    }

    
    public void addSubscriber(Subscriber subscriber) {
            subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
            subscribers.remove(subscriber);
    }

    @Override
    public void listSubscribers() {
            Iterator<Subscriber> iterator = subscribers.iterator();
            while(iterator.hasNext())
                    System.out.println(iterator.next());
    }
    
}
