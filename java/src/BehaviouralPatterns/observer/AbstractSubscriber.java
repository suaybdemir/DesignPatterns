/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.observer;

/**
 *
 * @author ubuntu
 */
public abstract class AbstractSubscriber implements Subscriber{
    
    protected String name;
    
    public AbstractSubscriber(String name)
    {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
