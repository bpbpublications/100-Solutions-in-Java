/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess3Codes;

/**
 *
 * @author Admin3
 */
public class Area {

    int length;
    int width;

    public Area() {
        length = 4;
    }

    public Area(int width) {
        this();  // invoking default constructor
        this.width = width; // resolving name conflict
    }

    public void calcArea() {
        System.out.println("Area is " + (length * width));
    }

    public static void main(String[] args) {
        Area objRect = new Area(3);
        objRect.calcArea();
    }
}
