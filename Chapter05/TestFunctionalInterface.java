/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess5Codes;

/**
 *
 * @author Admin3
 */
public class TestFunctionalInterface implements IChild{
    public static void main(String[] args) {
        TestFunctionalInterface obj = new TestFunctionalInterface();
        obj.displayIt();
        obj.display();
    }

    @Override
    public void displayIt() {
        System.out.println("Overridden method of child interface");
    }
}
