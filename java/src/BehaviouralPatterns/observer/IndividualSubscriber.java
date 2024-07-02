/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.observer;

/**
 *
 * @author ubuntu
 */
public class IndividualSubscriber extends AbstractSubscriber {

    public IndividualSubscriber(String name) {
        super(name);
    }

    
    @Override
    public void receive(Publication publication) {
        read(publication);
    }
    
    public void read(Publication publication)
    {
        System.out.println(name+" is reading "+publication.getName());
    }
}
