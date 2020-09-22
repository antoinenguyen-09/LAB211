/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Order {
    private String fruitName;
    private int quantity;
    private double price;

    public Order() {
    }

    public Order(String fruitName, int quantity, double price) {
        this.fruitName = fruitName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class OrderList extends ArrayList<Order>{
    
    public OrderList() {
        super();
    }
    
    public void adđOrder(Order ord){
        this.add(ord);
    }
    
    public void displayListOrder() {
        int id=1;
        double total = 0;
        System.out.printf("%15s%15s%15s%15s\n", "Product|", "Quantity|", "Price|", "Amount");
        for (Order order : this) {
            System.out.printf("%d.%15s%15d%15.0f$%15.0f$\n", id, order.getFruitName(), order.getQuantity(), order.getPrice(), order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
        }
        System.out.println("Total: " + total);
    }
    
    
}