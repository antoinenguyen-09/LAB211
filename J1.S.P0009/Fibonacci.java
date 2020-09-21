public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci: ");
        for (int i = 0; i < 45; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }
     
    
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
