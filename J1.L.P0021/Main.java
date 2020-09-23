public class Main {
    public static void main(String args[]){
        Menu mn = new Menu();
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        mn.add("1. Create");
        mn.add("2. Find and Sort");
        mn.add("3. Update/Delete");
        mn.add("4. Report");
        mn.add("5. Exit");
        int userChoice;
        do{
            mn.print();
            userChoice = mn.getUserChoices();
            switch(userChoice){
                case 1:
                    MnStudent.CreateNewStudent();
                    break;
                case 2:
                    MnStudent.Find_and_Sort();
                    break;
                case 3:
                    MnStudent.Update_or_Delete();
                    break;
                case 4:
                    MnStudent.report_st();
                    break;
                case 5:
                    System.exit(0); 
                    break;
            }
        } while(true);
    }
}
