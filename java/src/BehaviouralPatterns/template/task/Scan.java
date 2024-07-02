/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.template.task;

/**
 *
 * @author ubuntu
 */
public class Scan extends Task {

	public Scan(String name, int interval, int repetation) {
		super(name, interval, repetation);
	}

	@Override
	public void doTask() {
		System.out.println("I'm scanning!");
	}
}
