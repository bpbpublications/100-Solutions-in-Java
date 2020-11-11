/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess6Codes;

/**
 *
 * @author Admin3
 */
import java.util.ArrayList;

public class CheckPreCondition {

    ArrayList values = new ArrayList();

    public CheckPreCondition() {
        values.add("one");
        values.add("two");
        values.add("three");
        values.add("four");
    }

    public Object pop() {
        int size = values.size();
        System.out.println(size);
        if (size == 0) {
            throw new RuntimeException("List is empty!!");
        }
        Object result = values.remove(0);
        // verify the postcondition
        System.out.println(size);
        assert (values.size() == size - 1); // line 2
        return result;
    }
    
    public static void main(String[] args) {
        CheckPreCondition obj = new CheckPreCondition();
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
      
//        obj.pop();
//        obj.pop();
//        obj.pop();
//        obj.pop();
    }
}
