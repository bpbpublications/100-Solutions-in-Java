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
public class SwitchDemo {

    enum Days {
        Mon, Tue, Wed, Thu, Fri, Sat, Sun
    }

    public static void main(String[] args) {

        Days today = Days.Tue;
        String hour = "am";
        int week = 2;
        switch (today) {
            case Mon:
            case Tue:
            case Wed:
            case Thu:
            case Fri:
                System.out.println("Discount scheme for Weekdays");
                switch (week) {
                    case 1:
                    case 3:
                        System.out.println("No discount in week 1 and 3");
                        break;
                    case 2:
                    case 4:
                        System.out.println("20% disocount in week 2 and 4");
                        break;
                }
                break;
            case Sat:
            case Sun:
                switch (hour) {
                    case "am":
                        System.out.println("Discount is 40%");
                        break;
                    case "pm":
                        System.out.println("Discount is 20%");
                }
                break;
            default:
                System.out.println("Day does not exist");
                break;
        }
    }
}
