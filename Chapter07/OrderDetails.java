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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OrderDetails {

    public static void main(String args[]) {
        // Create an ArrayList of type Order 
        List<Order> orders = new ArrayList<>();
        Order orderP1 = new Order("P001", 40, 80.50, Order.Type.PREMIUM);
        Order orderN1 = new Order("N001", 75, 30.30, Order.Type.NORMAL);
        Order orderP2 = new Order("P002", 50, 95, Order.Type.PREMIUM);
        Order orderN2 = new Order("N002", 22, 55, Order.Type.NORMAL);
        Order orderP3 = new Order("P003", 30, 70, Order.Type.PREMIUM);
        orders.add(orderP1);
        orders.add(orderN1);
        orders.add(orderP2);
        orders.add(orderN2);
        orders.add(orderP3);
        
        // Filtering ArrayList by type of order 
        // by using filter() method Stream class 
        Stream<Order> stream = orders.stream();
        Stream premium = stream.filter((Order o) -> o.type().equals(Order.Type.PREMIUM));
        System.out.println("Total Premium Orders: " + premium.count());
        Stream<Order> normal = orders.stream().filter((Order o) -> o.type() == Order.Type.NORMAL);
        System.out.println("Total Normal Orders: " + normal.count());
        
        // Calculate total value of all orders 
        double value = orders.stream().mapToDouble((Order o) -> o.price()).sum();
        System.out.println("Total amount of orders: " + value);
        long quantity = orders.stream().mapToLong((Order o) -> o.quantity()).sum();
        System.out.println("Total quantity of orders: " + quantity);
    }
}
