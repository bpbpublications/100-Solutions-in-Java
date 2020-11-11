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
public class Toy {

    int id;
    String name, color;
    float price;

    public Toy(int id, String name, String color, float price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", Name:" + name + ", Color:" + color + ", Price:" + price+ "\n";
    }
}
