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
public class Circle {

    final float PI = 3.14f;

    public void calcArea(int rad) {
        System.out.println("Area of circle is " + (PI * rad * rad));
//        PI = 3.15f;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.calcArea(2);
    }
}
