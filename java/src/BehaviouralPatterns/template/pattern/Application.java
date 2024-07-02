/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.template.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public abstract class Application {
    
    private List<Document> documents = new ArrayList<>();

    
    void openDocument(String fileName) {
		if (canOpenDocument(fileName)) {
			Document doc = createDocument(fileName);
			addDocument(doc);
		}
	}
    
    abstract boolean canOpenDocument(String fileName);
    abstract Document createDocument(String fileName);
    
    void addDocument(Document doc) {
		documents.add(doc);
	}
    
}
