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
public class ShapeFactory {

    public static void main(String[] args) {
        ShapeFactory sFactory = new ShapeFactory();
        //get an object of Circle
        Shape1 objCircle = sFactory.getShape("Circle");
        //call the drawShape method of Circle class
        objCircle.drawShape();
        //get an object of Square
        Shape1 objSquare = sFactory.getShape("Square");
        //call the drawShape method of Square class
        objSquare.drawShape();
    }

    public Shape1 getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle1();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}

interface Shape1 {

    public void drawShape();
}

class Circle1 implements Shape1 {

    @Override
    public void drawShape() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape1 {

    @Override
    public void drawShape() {
        System.out.println("Drawing Square");
    }
}
