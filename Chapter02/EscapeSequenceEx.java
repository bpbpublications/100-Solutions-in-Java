/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

/**
 *
 * @author Admin3
 */
public class EscapeSequenceEx {

    public static void main(String[] args) {

        System.out.println("Using \t Escape Sequence Tab and \n New Line");

        System.out.println("This is Escape Sequence for \"Double Quotes\" in Java");

        // Prints ‘JAVA’ using hexadecimal escape sequences
        System.out.println("\u004A\u0041\u0056\u0041");
        // Prints ‘Year’ using octal escape sequence for character ‘a’
        System.out.println("Ye\141r \"2018\" ");
    }

}
