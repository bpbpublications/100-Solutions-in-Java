/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11demos;

/**
 *
 * @author dhrutis
 */
public class DrawShape {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.drawShape();
    }
}

class Shape{
    public void drawShape(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    @Override
    public void drawShape(){
        System.out.println("Drawing Circle");
    }
}
