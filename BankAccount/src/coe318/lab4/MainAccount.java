/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Kalp
 */
public class MainAccount {
    public static void main (String[] args) {
        Account bob = new Account("Bob", 789, 0.00);
        Account alice = new Account("Alice", 123, 100.00);
        System.out.println(bob);
        System.out.println(alice);
        alice.withdraw(15);
        System.out.println(alice);
        alice.withdraw(200);
        System.out.println(alice);
        alice.withdraw(-1);
        System.out.println(alice);
        alice.deposit(150);
        alice.withdraw(200);
        System.out.println(alice);
        bob.deposit(300);
        System.out.println(bob);
        bob.withdraw(100);
        System.out.println(bob);
 
    }
    
}
