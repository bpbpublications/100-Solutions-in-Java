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
import java.util.Stack;
import java.util.EmptyStackException;

public class StackExample {
    static void pushValue(Stack st, int val) {
      st.push(val);
      System.out.println("Pushed(" + val + ")");
      System.out.println("Stack: " + st);
   }

   static void popValue(Stack st) {
      System.out.print("Popped -> ");
      Integer val = (Integer) st.pop();
      System.out.println(val);
      System.out.println("Stack: " + st);
   }

   public static void main(String args[]) {
      Stack st1 = new Stack();
      System.out.println("Stack: " + st1);
      pushValue(st1, 24);
      pushValue(st1, 33);
      pushValue(st1, 45);
      popValue(st1);
      popValue(st1);
      popValue(st1);
      try {
         popValue(st1);
      } catch (EmptyStackException e) {
         System.out.println("Error: Stack is empty");
      }
   }
}
