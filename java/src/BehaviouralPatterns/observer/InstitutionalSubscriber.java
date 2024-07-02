/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.observer;

/**
 *
 * @author ubuntu
 */
public class InstitutionalSubscriber extends AbstractSubscriber{

   private String name;
	
	public InstitutionalSubscriber(String name) {
		super(name);
	}
	
	public void receive(Publication publication) {
		putOnShelf(publication);
	}

	public void putOnShelf(Publication publication) {
		System.out.println(publication.getName() + " is on the shelf of " + name);
	}
    
}
