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
public class Calculator {
    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        c.add(1,2);
        c.add(4,5,6);
        System.out.println("a+b = "+c.add(4, 5.5f));
    }
    
    public void add(int a, int b){
        System.out.println("a+b = "+(a+b));
    }
    
    public float add(int a, float b){
        return (a+b);
    }
    
    public void add(int a, int b, int c){
        System.out.println("a+b+c = "+(a+b+c));
    }
    
}
