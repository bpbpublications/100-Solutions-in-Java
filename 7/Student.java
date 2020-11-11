/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess7Codes;

/**
 *
 * @author Admin3
 */
public class Student implements Comparable<Student> {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        if (age == s.age) {
            return 0;
        } else if (age > s.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
