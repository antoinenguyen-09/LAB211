import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ASUS
 */
public class Utility {
    public static int getPositive(String msg){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.println(msg);
            try
            {
                i = Integer.parseInt(sc.nextLine());
                if(i>0)
                   loop = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
                sc.nextLine();
            }
        }while(loop);
        System.out.println();
        return i;
    }
    
    public static int getRandomInRange(int max, int min){
        if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
}
