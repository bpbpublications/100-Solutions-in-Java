/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos;

/**
 *
 * @author dhrutis
 */
public class TestSynchornizedBlock {

    public static void main(String[] args) {
        BankAccount accObj = new BankAccount();
        Transaction t1 = new Transaction(accObj, 30000.00);
        Transaction t2 = new Transaction(accObj, 6000.00);
            }
}

class BankAccount {

    double balance = 800.0;

    public void depositAmount(double amount) {
        balance = balance + amount;
    }

    public void showBalance() {
        System.out.println("Balance:" + balance);
    }
}

class Transaction implements Runnable {

    double amount;
    BankAccount a1;
    Thread t;

    public Transaction(BankAccount a1, double amt) {
        this.a1 = a1;
        amount = amt;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        // Synchronized block 
        synchronized (a1) { 
            a1.depositAmount(amount);
            a1.showBalance();
        }
    }
}
