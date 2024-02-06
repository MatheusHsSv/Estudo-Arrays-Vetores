package ListEntities;

import ListExercises.ShoppingCart;

public class ShoppingCartSystem {
    private String name;
    private double price;


    public ShoppingCartSystem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
