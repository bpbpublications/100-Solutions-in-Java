/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author dhrutis
 */
public class ObjectOutputStreamDemo {

    public static void main(String[] args) {
        // create input and output streams
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("D:\\Demos\\Student.txt");
            oos = new ObjectOutputStream(fos);
            
            // create a Student object for serialization
            Student s1 = new Student();
            s1.lastName = "Preston";
            s1.firstName = "Clark";
            s1.score = 68.7f;
            // write the objec to the output stream
            oos.writeObject(s1);
            oos.close();
            fos.close();
            
            // initilize the input streams
            fis = new FileInputStream("D:\\Demos\\Student.txt");
            ois = new ObjectInputStream(fis);
            
            //de-serialize Student object
            Student s = (Student) ois.readObject();
            System.out.println("Deserialized Data:\n" + s.firstName + " "
                    + s.lastName + "\n" + s.score);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception occurred");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                System.out.println("Exception while closing stream");
            }
        }
    }
}

// create a Serailizable class
class Student implements Serializable {

    String lastName;
    String firstName;
    float score;
}
