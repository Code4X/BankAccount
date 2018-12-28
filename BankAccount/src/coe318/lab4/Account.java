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
public class Account {
    private int accNum;
    private String name;
    private double balance;
 
    public Account(String client, int n, double initialBalance) {
        name = client;
        accNum = n;
        balance = initialBalance;

    }

    String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;

    }

    public int getNumber() {
        return accNum;
    }

    public void setNumber(int accNum1) {
        accNum = accNum1;
    }

    double getBalance() {
        return balance;
    }

    public void setBalance(double balance1) {
        balance = balance1;
    }

    boolean deposit(double amount) 
    {
        if (amount >= 0) 
        {
        balance = balance + amount;
            return true;
        } 
        else 
        {
            return false;

        }
    }

    boolean withdraw(double amount) 
    {

        if (amount < balance && amount > 0) 
        {
            balance = balance - amount;
            return true;
        }
        else 
        {
            return false;
        }
    }
    @Override
    public String toString() {//DO NOT MODIFY        
        return "(" + getName() + ", " + getNumber() + ", " +                
                String.format("$%.2f", getBalance()) + ")";    }
}
