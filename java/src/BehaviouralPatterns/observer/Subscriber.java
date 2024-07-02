/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehaviouralPatterns.observer;

/**
 *
 * @author ubuntu
 */
public interface Subscriber {
    public String getName();
    public void receive(Publication publication);
}
