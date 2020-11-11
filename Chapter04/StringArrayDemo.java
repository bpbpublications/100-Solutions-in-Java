/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess4Codes;

/**
 *
 * @author Admin3
 */
public class StringArrayDemo {

    String[] itemId = new String[5];

    public StringArrayDemo() {
        System.out.println("Products Added");

        for (int count = 0; count < itemId.length; count++) {
            itemId[count] = "Item00" + (count+1);
        }
    }

    public void displayProducts() {
        System.out.println("Products in the inventory are:");

        for (String item : itemId) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        StringArrayDemo obj = new StringArrayDemo();
        obj.displayProducts();
    }
}
