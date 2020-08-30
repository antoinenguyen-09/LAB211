/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author ASUS
 */
public class Student {
    private int ID;
    private String name;
    private int semester;
    private String course;

    public Student(int ID, String name, int semester, String course) {
        this.ID = ID;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getSemester() {
        return semester;
    }
    public String getCourse() {
        return course;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void print(){
        System.out.println(ID+" | "+name+" | "+semester+" | "+course);
    }
}
class StudentList extends ArrayList<Student>{
    public StudentList() {
        super();
    }    
    public int createStudent(Student st){
        this.add(st);
        return this.size();
    }
    public void findbyName(String name){
        boolean exist=false;
        for(Student st: this){
            if(st.getName().equals(name)||st.getName().contains(name)){
                st.print();
                exist=true;
            }
        }
        if(exist==false) System.out.print("Student does not exist!");
    }
    public void sort(){
        Collections.sort(this, new Comparator<Student>(){
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });
    }
    public void print(){
        for(Student st: this){
            System.out.println(st.getName()+" | "+st.getSemester()+" | "+st.getCourse());
        }
        System.out.println();
    } 
    public int findbyID(int id){
        for(Student st: this){
            if(st.getID()==id){
                st.print();
                return id;
            }
        }
        return 0;
    }
    public void update(int id){
       String name, course;
       int semester;
       for(Student st:this){
           if(st.getID()==id){
               name = Utility.GetString("Update student's name: ", false);
               st.setName(name);
               semester = Utility.getInt("Update student's semester: ");
               st.setSemester(semester);
               course = Utility.GetString("Update student's course: ", false);
               st.setCourse(course);
           }
       }
    }
    public void delete(int id){
        Iterator itr = this.iterator();
        while(itr.hasNext()){
            Student st= (Student) itr.next();
            if(st.getID()==id) itr.remove();
        }
    }
    public void report(){
        ArrayList<String> st_strlist = new ArrayList<>();
        for(Student st: this){
            st_strlist.add(st.getName()+"|"+st.getCourse());
        }
        Set<String> st_strset = new HashSet<>(st_strlist);
        ArrayList<String> cour_report = new ArrayList<>();
        Iterator itr = st_strset.iterator();
        while(itr.hasNext()){
            String row = (String) itr.next();
            cour_report.add(row+"|"+Collections.frequency(st_strlist, row));
        }
        for(String str:cour_report){
            System.out.println(str);
        }
    }
}

