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
public abstract class Topping implements Toastable{
    
    private String name;
    protected Toastable toastTopping;
    protected int price;
    
    private List<Topping> toppings = new ArrayList<>();

    public Topping(Toastable toastTopping, int price,String name) {
        
        this.toastTopping = toastTopping;
        toppings.add(this);
        
        this.name = name;
        this.price = price;
    }

    @Override
    public int calculatePrice() {
        return toastTopping.calculatePrice() + price;
    }

    @Override
    public List<Topping> getToppings() {
        List<Topping> toppings = toastTopping.getToppings();
        toppings.add(this);
        return toppings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Toastable getToastTopping() {
        return toastTopping;
    }

    public void setToastTopping(Toastable toastTopping) {
        this.toastTopping = toastTopping;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Topping{" + "name=" + name + ", toastTopping=" + toastTopping + ", price=" + price + ", toppings=" + toppings + '}';
    }
    
    
}
