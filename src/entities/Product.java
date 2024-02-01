package entities;

public class Product {

    private final String name;
    private final double price;


    public Product(String name, double price){
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

}
