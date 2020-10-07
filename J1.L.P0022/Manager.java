import java.util.ArrayList;

public class Manager {
    static ArrayList<Candidate> cnd_list = new ArrayList<>();
    public static void createCandidate(int type){
        System.out.println("Create new candidate:");
        boolean loop=true;
        do{
            int id;
            boolean invalid=false;
            do{
               id = Utility.getInt("Enter id: ");
               if(cnd_list.size()>=1){
                  for(Candidate cnd : cnd_list){
                    if(cnd.getId()==id){
                      invalid=true;
                      System.out.println("This id has already existed!");
                      break;
                    }
                  }
                }
            } while(invalid);
            String firstname = Utility.GetString("Enter first name: ", false);
            String lastname = Utility.GetString("Enter last name: ", false);
            String address = Utility.GetString("Enter address: ", false);
            String phone = Utility.getPhone("Enter phone number: ");
            String email = Utility.getEmail("Enter email: ");
            int birthdate = Utility.getDate("Enter birth date: ");
            Candidate cnd = new Candidate(id, phone, firstname, lastname, address, birthdate, type, email);
            switch(type){
               case 0:
                   createExperience(cnd);
                   break;
               case 1:
                   createFresher(cnd);
                   break;
               case 2:
                   createIntern(cnd);
                   break;
            }
            if(Utility.GetYesNo("Do you want to continue (Y/N)? ")==false){
                loop=false;
                System.out.println();
            }
       } while(loop);
       System.out.println("Candidate created: ");
       for(Candidate cnd : cnd_list){
           cnd.print();
       }
        System.out.println();
    }
    
    public static void createExperience(Candidate cnd){
        System.out.println("Input informations of a experience candiate: ");
        int yearExp = Utility.getYear("Enter year of experience: ");
        String proskill = Utility.GetString("Enter professional skill: ", false);
        cnd_list.add(new Experience(cnd.getId(), cnd.getPhone(), cnd.getFirstname(), cnd.getLastname(), cnd.getAddress(), cnd.getBirthDate(), cnd.getTypeCandidate(), cnd.getEmail(), yearExp, proskill));
        System.out.println("Create experience candiate successfully!");
    }
    
    public static void createFresher(Candidate cnd){
        System.out.println("Input informations of a fresher candiate: ");
        int graduate_date = Utility.getDate("Enter graduated time: ");
        String graduate_rank = Utility.getRank("Enter rank of graduation: ");
        String uni_edu = Utility.GetString("Enter university graduated from: ", false);
        cnd_list.add(new Fresher(cnd.getId(), cnd.getPhone(), cnd.getFirstname(), cnd.getLastname(), cnd.getAddress(), cnd.getBirthDate(), cnd.getTypeCandidate(), cnd.getEmail(), graduate_date, graduate_rank, uni_edu));
        System.out.println("Create fresher candiate successfully!");
    }
    
    public static void createIntern(Candidate cnd){
        System.out.println("Input informations of a intern candiate: ");
        String majors = Utility.GetString("Enter majors: ", false);
        int semester = Utility.getInt("Enter semester: ");
        String uni_name = Utility.GetString("Enter university studying: ", false);
        cnd_list.add(new Intern(cnd.getId(), cnd.getPhone(), cnd.getFirstname(), cnd.getLastname(), cnd.getAddress(), cnd.getBirthDate(), cnd.getTypeCandidate(), cnd.getEmail(), majors, semester, uni_name));
        System.out.println("Create intern candiate successfully!");
    }
    
    public static void displayClassifiedCandidate(){
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for(Candidate cnd : cnd_list){
            if(cnd instanceof Experience)
                System.out.println(cnd.getFirstname()+" "+cnd.getLastname());
        }
        System.out.println("==========FRESHER CANDIDATE==============");
        for(Candidate cnd : cnd_list){
            if(cnd instanceof Fresher)
                System.out.println(cnd.getFirstname()+" "+cnd.getLastname());
        }
        System.out.println("===========INTERN CANDIDATE==============");
        for(Candidate cnd : cnd_list){
            if(cnd instanceof Intern)
                System.out.println(cnd.getFirstname()+" "+cnd.getLastname());
        }
        System.out.println();
    }
    
    public static void searchCandidate(){
        displayClassifiedCandidate();
        String searchName = Utility.GetString("Input Candidate name (First name or Last name): ", false);
        int input_type = Utility.getCandidateType("Input type of candidate: ");
        boolean exist = false;
        System.out.println("The candidates found:");
        for(Candidate cnd : cnd_list){
            if((cnd.getFirstname().contains(searchName)||cnd.getLastname().contains(searchName)) && cnd.getTypeCandidate()==input_type){
                System.out.println(cnd.getFirstname()+" "+cnd.getLastname()+" | "+cnd.getBirthDate()+" | "+cnd.getAddress()+" | "+cnd.getPhone()+" | "+cnd.getEmail()+" | "+cnd.getTypeCandidate());
                exist = true;
            }
        }
        if(exist==false) System.out.println("The candidate do not exist!");
    }   
}
