/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.template.pattern;

/**
 *
 * @author ubuntu
 */
public class MyDocument extends Document {

    public MyDocument(String name) {
        super(name);
    }
    
    @Override
	void open() {
		System.out.println("Document " + name + " is opened.");
	}

	@Override
	void read() {
		System.out.println("Document " + name + " is read.");		
	}

	@Override
	void save() {
		System.out.println("Document " + name + " is saved.");		
	}

	@Override
	void close() {
		System.out.println("Document " + name + " is closed.");		
	}
    
}
