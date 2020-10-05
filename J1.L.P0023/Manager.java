import java.util.ArrayList;

public class Manager {
    public static void displayCreatedFruit(ArrayList<Fruit> fr_list){
        for(Fruit fr: fr_list){
            fr.print();
        }
    }
    
    public static void displayOrderList(ArrayList<Order> ord_list) {
        int id=1;
        double total = 0;
        System.out.printf("%15s%15s%15s%15s\n", "Product |", "Quantity |", "Price |", "Amount");
        for (Order order : ord_list) {
            System.out.printf("%d.%13s%13d%13.0f$%13.0f$\n", id, order.getFruitName(), order.getQuantity(), order.getPrice(), order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
            id++;
        }
        System.out.println("Total: " + total+"$");
    }
    
    public static void displayShopFruit(ArrayList<Fruit> fr_list){
        System.out.println("List of Fruit: ");
        System.out.printf("%15s%15s%15s%15s%15s\n", "Item |", "Fruit Name |", "Origin |", "Price |", "Quantity");
        for(Fruit fr : fr_list){
            System.out.printf("%15d%15s%15s%15.0f%15d\n", fr.getFruitID(), fr.getFr_name(), fr.getOrigin(), fr.getPrice(), fr.getQuantity());
        }
    }
    
    public static boolean checkFruitbyItem(int item, ArrayList<Fruit> fr_list){
        boolean unavailable=true;
        for(Fruit fr : fr_list){
            if(item==fr.getFruitID()){
                System.out.println("You selected: "+ fr.getFr_name());
                unavailable=false;
            }
        }
        if(unavailable==true) System.out.println("Invalid ID!");
        return unavailable;
    }
    
    public static boolean inputValidQuantity(int valid_item, ArrayList<Fruit> fr_list, int input_quantity){
        boolean unsufficient=false;
        for(Fruit fr : fr_list){
            if(valid_item==fr.getFruitID()){
                if(input_quantity>fr.getQuantity()){
                    System.out.println("Do not have enough "+fr.getFr_name()+" for you!");
                    unsufficient=true;
                }
            }
        }
        return unsufficient;
    }  
}
