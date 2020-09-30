import java.util.ArrayList;
import java.util.Hashtable;

public class Manager {
    public static void displayCreatedFruit(ArrayList<Fruit> fr_list){
        for(Fruit fr: fr_list){
            fr.print();
        }
    }
    
    public static void displayListOrder(ArrayList<Order> ord_list) {
        int id=1;
        double total = 0;
        System.out.printf("%15s%15s%15s%15s\n", "Product|", "Quantity|", "Price|", "Amount");
        for (Order order : ord_list) {
            System.out.printf("%d.%15s%15d%15.0f$%15.0f$\n", id, order.getFruitName(), order.getQuantity(), order.getPrice(), order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
        }
        System.out.println("Total: " + total);
    }
    
    public static void viewOrder(Hashtable<String, ArrayList<Order>> ord_ht){
        for(String name:ord_ht.keySet()){
            System.out.println("Customer: "+name);
            ArrayList<Order> ord_list = ord_ht.get(name);
            displayListOrder(ord_list);
        }
    }
    
    
}
