/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess8Codes;

/**
 *
 * @author Admin3
 */
import java.util.LinkedList;

public class Toys<T,U> {

    private U title;
    private LinkedList<T> toyList = new LinkedList<>();

    public void addTitle(U title){
        this.title=title;
        
    }
    public U showTitle(){
        return title;
    }
    public void addToy(T item) {
        toyList.addLast(item);
    }

    public T removeToy() {
        return toyList.removeFirst();
    }

    public boolean checkEmpty() {
        return (toyList.isEmpty());
    }
    
    public String viewToys(){
        return toyList.toString();
    }

    public static void main(String[] args) {
        Toys<String,String> toyObj = new Toys<>();
        toyObj.addTitle("Toys List");
        System.out.println(toyObj.showTitle());
        toyObj.addToy("Barbie");
        toyObj.addToy("Teddy Bear");
        System.out.println(toyObj.viewToys());
        System.out.println("First Toy: "+toyObj.removeToy());
    }
}
