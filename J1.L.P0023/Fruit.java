import java.util.ArrayList;

public class Fruit {
    private int fruitID;
    private int quantity;
    private double price;
    private String fr_name, origin;

    public Fruit(int fruitID, int quantity, double price, String fr_name, String origin) {
        this.fruitID = fruitID;
        this.quantity = quantity;
        this.price = price;
        this.fr_name = fr_name;
        this.origin = origin;
    }

    public int getFruitID() {
        return fruitID;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getfr_name() {
        return fr_name;
    }

    public String getOrigin() {
        return origin;
    }
    
    public String getFr_name() {
        return fr_name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setfr_name(String fr_name) {
        this.fr_name = fr_name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public void print(){
        System.out.println(fruitID+"."+fr_name+"\t"+quantity+"\t"+price+"$\t"+price*quantity+"$");
    }
}

class FruitList extends ArrayList<Fruit>{
    public FruitList() {
        super();
    }
    
    public void adđFruit(Fruit fr){
        this.add(fr);
    }
    
    public void displayCreatedFruit(){
        for(Fruit fr:this){
            fr.print();
        }
    }
    
    public void displayShoppingFruit(){
        int countItem=1;
        System.out.println("List of Fruit: ");
        System.out.printf("%-10s%-20s%-20s%-15s\n", "Item", "Fruit name", "Origin", "Price");
        for (Fruit fruit : this) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                System.out.printf("%-10d%-20s%-20s%-15.0f$\n", countItem++,fruit.getfr_name(), fruit.getOrigin(), fruit.getPrice());
            }
        } 
    }   
}
