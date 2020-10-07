import java.util.Scanner;
import java.util.regex.Pattern; 

public class Utility {
    public static int getDate(String msg){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.println(msg);
            try
            {
                i = Integer.parseInt(sc.nextLine());
                if(i>=1900 && i<=2020)
                   loop = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid date!");
                sc.nextLine();
            }
        }while(loop);
        System.out.println();
        return i;
    }
    
    public static String getPhone(String msg){
        String phone;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            boolean isNumber=true;
            int count=0;
            System.out.println(msg);
            phone = sc.nextLine();
            if(phone == null){
                System.out.println("Invalid input!");
                continue;
            }
            for(char ch : phone.toCharArray()){
                if(!Character.isDigit(ch)){
                    isNumber = false;
                    break;
                }
                count++;
            }
            if(isNumber==true && count>=10)
                loop = false;
            else
                System.out.println("Invalid phone number!");
        }while(loop);
        System.out.println();
        return phone;
    }
    
    public static String getEmail(String msg){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex);
        String email;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.println(msg);
            email = sc.nextLine();
            if(email == null){
                System.out.println("Invalid input!");
                continue;
            }
            if(pat.matcher(email).matches())
                loop=false;
            else
                System.out.println("Invalid email!");
        } while(loop);
        return email;
    }
    
}
