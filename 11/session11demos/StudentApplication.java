/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11demos;

/**
 *
 * @author dhrutis
 */
public class StudentApplication {
    
    public static void main(String[] args) {
        IStudent objStudent = new StudentImpl();
        System.out.println("Student Details");
        //display all students details
        System.out.println("ID\tName");
        for (Student1 objS : objStudent.getAllStudents()) {
            System.out.println(objS.getID() + "\t" + objS.getName());
        }
        //update student detail
           objStudent.updateStudent(1, "Roger");
       
        //get a specific student's detail
        Student1 s1 = objStudent.getStudent(1);
        System.out.println("Student: [ID : " + s1.getID() + ", Name:" + s1.getName() + " ]");
//        
        //display all students details after update
        System.out.println("Student Details after Update");
        System.out.println("ID\tName");
        for (Student1 objS : objStudent.getAllStudents()) {
            System.out.println(objS.getID() + "\t" + objS.getName());
        }
        
        //delete student detail
           objStudent.deleteStudent(1);
           
           //display all students details after update
        System.out.println("Student Details after Delete");
        System.out.println("ID\tName");
        for (Student1 objS : objStudent.getAllStudents()) {
            System.out.println(objS.getID() + "\t" + objS.getName());
        }
    }
}

// DAO Model 
class Student1 {

    private String name;
    private int ID;

    Student1(int ID, String name) {
        this.ID = ID;
        this.name = name;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// DAO interface
interface IStudent {

    public java.util.List<Student1> getAllStudents();

    public Student1 getStudent(int ID);

    public void updateStudent(int ID, String name);

    public void deleteStudent(int ID);
}

// DAO implementation class
class StudentImpl implements IStudent {
// list is used as a datasource

    java.util.List<Student1> lstStudent;

    public StudentImpl() {
        lstStudent = new java.util.ArrayList<>();
        Student1 s1 = new Student1(1, "Jack");
        Student1 s2 = new Student1(2, "Mary");
        lstStudent.add(s1);
        lstStudent.add(s2);
    }

    
// retrieve list of students from the data source

    @Override
    public java.util.List<Student1> getAllStudents() {
        return lstStudent;
    }

    @Override
    public Student1 getStudent(int ID) {
        // ID-1 done to get the correct index position
        return lstStudent.get(ID-1);
    }

    @Override
    public void updateStudent(int ID, String name) {
        lstStudent.get(ID-1).setName(name);
        System.out.println("Student: ID " + ID + ", updated in the database.");
    }
    
    @Override
    public void deleteStudent(int ID) {
        lstStudent.remove(ID-1);
        System.out.println("Student: ID " + ID + ", deleted from database.");
    }
}
