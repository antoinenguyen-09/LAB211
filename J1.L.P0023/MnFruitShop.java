/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MnFruitShop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int id=0, quantity;
        double price;
        String fr_name, origin;
        FruitList fr_list = new FruitList();
        OrderList ord_list = new OrderList();
        Menu mn = new Menu();
        mn.add("1. Create fruit");
        mn.add("2. View orders");
        mn.add("3. Shopping (for buyer)");
        mn.add("4. Exit");
        int userChoice;
        do{
            mn.print();
            userChoice = mn.getUserChoices();
            switch(userChoice){
                case 1:
                    boolean loop=true;
                    do{
                        id++;
                        System.out.println("Create a new fruit: ");
                        fr_name = Utilily.GetString("Enter fruit's name: ", false);
                        origin = Utilily.GetString("Enter fruit's origin: ", false);
                        quantity = Utilily.getInt("Enter fruit's quantity: ");
                        price = Utilily.getDouble("Enter fruit's price: ");
                        Fruit fr = new Fruit(id, quantity, price, fr_name, origin);
                        fr_list.adđFruit(fr);
                        Order ord = new Order(fr_name, quantity, price);
                        ord_list.add(ord);
                        if(Utilily.GetYesNo("Do you want to continue (Y/N)?")==false) loop=false;
                    } while(loop);
                        fr_list.displayCreatedFruit();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while(true);
    }
}
