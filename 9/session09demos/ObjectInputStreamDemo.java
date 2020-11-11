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
public class ObjectInputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        ObjectInputStream oIn = null;
        ObjectOutputStream oOut = null;
        try {
            fOut = new FileOutputStream("D:\\NewEmplyee.Ser");
            oOut = new ObjectOutputStream(fOut);
            Employee e = new Employee();
            e.lastName = "Smith";
            e.firstName = "John";
            e.sal = 5000.00;
            oOut.writeObject(e);
            oOut.close();
            fOut.close();
            fIn = new FileInputStream("E:\\NewEmplyee.Ser");
            oIn = new ObjectInputStream(fIn);
            //de-serializing employee
            Employee emp = (Employee) oIn.readObject();
            System.out.println("Deserialized - " + emp.firstName + " "
                    + emp.lastName + " from NewEmployee.ser");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Employee implements Serializable {

    String lastName;
    String firstName;
    double sal;
}
