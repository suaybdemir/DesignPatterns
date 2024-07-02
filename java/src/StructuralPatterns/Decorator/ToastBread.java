/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructuralPatterns.Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public class ToastBread implements Toastable{
    
    private static String name;
    protected int price;
    
    public ToastBread(String name,int price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public int calculatePrice() {
        return price;
    }

    @Override
    public List<Topping> getToppings() {
        return new ArrayList<Topping>();
    }
    
}
