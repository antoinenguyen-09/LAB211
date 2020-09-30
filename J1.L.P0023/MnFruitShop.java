import java.util.ArrayList;

public class MnFruitShop {
    static int id=0, quantity;
    static double price;
    static String fr_name, origin;
    static ArrayList<Fruit> fr_list = new ArrayList<>();
    static ArrayList<Order> ord_list = new ArrayList<>();
    
    public static void createProduct(){
        boolean loop=true;
        do{
            id++;
            System.out.println("Create a new fruit: ");
            fr_name = Utilily.GetString("Enter fruit's name: ", false);
            origin = Utilily.GetString("Enter fruit's origin: ", false);
            quantity = Utilily.getInt("Enter fruit's quantity: ");
            price = Utilily.getDouble("Enter fruit's price: ");
            Fruit fr = new Fruit(id, quantity, price, fr_name, origin);
            fr_list.add(fr);
            Order ord = new Order(fr_name, quantity, price);
            ord_list.add(ord);
            if(Utilily.GetYesNo("Do you want to continue (Y/N)?")==false) loop=false;
        } while(loop);
            fr_list.displayCreatedFruit();
    }
    
    
}
