import java.util.Scanner;

public class MnStudent {
    public static void main(String args[]){
        int id=0, semester;
        String name, course;
        Scanner sc = new Scanner(System.in);
        StudentList st_list = new StudentList();
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
                  boolean loop=true;
                  System.out.println("Create a new student: ");
                  do{
                      id++;
                      name = Utility.GetString("Enter student's name: ", false);
                      semester = Utility.getInt("Enter student's semester: ");
                      course = Utility.GetString("Enter student's course: ", false);
                      Student st = new Student(id, name, semester, course);
                      st_list.add(st);
                      if(st_list.size()<10)
                          System.out.println("You need to create at least 10 students");
                      else{
                         if(Utility.GetYesNo("Do you want to continue (Y/N)?")==false) loop=false;
                      }
                  } while(loop);
                  break;
                case 2:
                    System.out.println("Find a student by name: ");
                    String input_name = Utility.GetString("Enter the name: ", false);
                    st_list.findbyName(input_name); System.out.println();
                    System.out.println("Sort student list: ");
                    st_list.sort();
                    st_list.print();
                    break;
                case 3:
                    int inputID = Utility.getInt("Enter student needed to update or delete's id: "), validID;
                    if((validID=st_list.findbyID(inputID))!=0){
                        do{
                            String choice = Utility.GetString("(Do you want to update (U) or delete (D) student?", false);
                            if(choice.equalsIgnoreCase("U")) {
                                st_list.update(validID);
                                break;
                            } else if(choice.equalsIgnoreCase("D")){
                                st_list.delete(validID);
                                break;
                            } else System.out.println("Wrong input!!! Enter again!");
                        } while(true);
                    }
                    break;
                case 4:
                    st_list.report();
                    break;
                case 5:
                    System.exit(0); break;
            }
        } while(true);
    }
}
