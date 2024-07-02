/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.observer;

import java.util.Date;

/**
 *
 * @author ubuntu
 */
public class Publisher {
    private Publication newsweek;
	private Publication fourFourTwo;
	
	public Publisher() {
		newsweek = new Newsweek("Newsweek");
		fourFourTwo = new FourFourTwo("FourFourTwo");
	}	
	
	public void publishNewsweek(){
		System.out.println("\n New Newsweek On The Way");
		Date date = new Date();
		newsweek.publish(date.toString());
	}
	
	public void publishFourFourTwo(){
		System.out.println("\n New FourFourTwo On The Way");
		Date date = new Date();
		fourFourTwo.publish(date.toString());
	}

	public Publication getNewsweek() {
		return newsweek;
	}

	public Publication getFourFourTwo() {
		return fourFourTwo;
	}
}
