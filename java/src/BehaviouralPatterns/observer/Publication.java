/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehaviouralPatterns.observer;

/**
 *
 * @author ubuntu
 */
public interface Publication {
    
    public String getName();
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void publish(String date);
    public void listSubscribers();
    
}
