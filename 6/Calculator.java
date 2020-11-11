/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess6Codes;

/**
 *
 * @author Admin3
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        Calculator obj = new Calculator();
        try {
            obj.calculate(num1, num2);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("----------------------");
            System.out.println("All resources closed in finally block");
        }
    }
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1 = s.nextInt();
//        System.out.println("Enter second number");
//        int num2 = s.nextInt();
//        Calculator obj = new Calculator();
//        try {
//            obj.calculate(num1, num2);
//        } catch (ArithmeticException e) {
//            System.out.println("Exception occurred: " + e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception occurred: " + e);
//        } finally {
//            System.out.println("----------------------");
//            System.out.println("All resources closed in finally block");
//        }
//    }

    public void calculate(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {

        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }

        int c = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + c);

        int arr[] = new int[c];
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            arr[i] = i + 1;
        }
    }

//    public void calculate(int a, int b){
//        try{
//            int c = a/b;
//            System.out.println("Division of "+a+" and "+b+ " is "+ c);
//            
//            int arr[]= new int[c];
//            for(int i=0;i<=arr.length;i++){
//                arr[i]=i+1;
//            }
//        }catch(ArithmeticException e){
//            System.out.println("Exception occurred: "+ e.getMessage());
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception occurred: "+ e);
//        }
//        finally{
//            System.out.println("----------------------");
//            System.out.println("All resources closed in finally block");
//        }
//    }
}
