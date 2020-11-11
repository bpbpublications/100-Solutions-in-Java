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
public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(id + "\t" + name);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Roger");
        System.out.println("Student Detail:\n" + "ID \t Name");
        System.out.println(s);
    }
}
