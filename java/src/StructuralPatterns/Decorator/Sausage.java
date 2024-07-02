/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralPatterns.Decorator;

/**
 *
 * @author ubuntu
 */
public class Sausage extends Topping {
    
    public Sausage(Toastable toastTopping,String name,int price)
    {
        super(toastTopping,price,name);
    }
}
