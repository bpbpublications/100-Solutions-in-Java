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
public class Order {
        enum Type {
        PREMIUM, NORMAL;
    }
    private final String id;
    private final int quantity;
    private double price;
    private final Type type;

    public Order(String id, int quantity, double price, Type type) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public double price() {
        return price;
    }

    public void price(double price) {
        this.price = price;
    }

    public String id() {
        return id;
    }

    public int quantity() {
        return quantity;
    }

    public Type type() {
        return type;
    }
}
