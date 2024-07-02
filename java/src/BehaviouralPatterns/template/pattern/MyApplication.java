/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.template.pattern;

/**
 *
 * @author ubuntu
 */
public class MyApplication extends Application{


    @Override
    void addDocument(Document document) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
	boolean canOpenDocument(String fileName) {
		System.out.println("Checking the document " + fileName);
		return true;
	}

    @Override
	Document createDocument(String fileName) {
		System.out.println("Opening document " + fileName);
		return new MyDocument(fileName);
	}
    

    
}
