/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralPatterns.template.pattern;

/**
 *
 * @author ubuntu
 */
public abstract class Document {

    protected String name;
    
    public Document(String name) {
        this.name = name;
    }
    
    abstract void close();
    
    public String getName(String name)
    {
        return name;
    }
    
    
    abstract void open();
    abstract void read();
    abstract void save();
    
}
