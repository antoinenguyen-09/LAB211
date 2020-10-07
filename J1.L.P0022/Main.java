public class Main {
    public static void main (String[] args){
        Menu mn = new Menu();
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        mn.add("1. Experience");
        mn.add("2. Fresher");
        mn.add("3. Internship");
        mn.add("4. Searching");
        mn.add("5. Exit");
        int userChoice;
        do{
            mn.print();
            userChoice = mn.getUserChoices();
            switch(userChoice){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:    
                    System.exit(0);
                    break;
            }
        } while(true);
    }
}
