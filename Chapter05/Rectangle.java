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
public class Rectangle extends Shape {

//    public Rectangle() {
//        super("rectangle");
//        width = 20;
//    }
//
//    public void drawRect() {
//        System.out.println("Drawing a Rectangle");
//    }
    private float length, width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of rectangle: " + (length * width));
    }
}
