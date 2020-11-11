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
public abstract class Shape {

    private final float PI = 3.14f;
//    protected float width;
//    private String shape;

//    public Shape(String shape) {
//        this.shape = shape;
//    }
    
    // concrete method
  public float getPI(){
     return PI;
  }

  // abstract method
   public abstract void calculateArea();


//    public void area(float length) {
//
//        switch (shape.toLowerCase()) {
//            case "circle":
//                System.out.println("Area of Circle is " + (PI * length * length));
//                break;
//            case "square":
//                System.out.println("Area of Square is " + (length * length));
//                break;
//            case "rectangle":
//                System.out.println("Area of Rectangle is " + 2 * (length + width));
//                break;
//            case "triangle":
//                System.out.println("Area of a Triancle is " + (1 / 2 * (length * width)));
//        }
//    }
}
