/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.template.task;

/**
 *
 * @author ubuntu
 */
public class Print extends Task{

	public Print(String name, int interval, int repetation) {
		super(name, interval, repetation);
	}
	
	public void prepare() {
		System.out.println("*** Preparing printing! ***");
	}
	
	public void clean() {
		System.out.println("*** Cleaning printing environment. ***");
	}

	@Override
	public void doTask() {
		System.out.println("Printing task.");		
	}
}
