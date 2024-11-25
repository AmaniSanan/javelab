/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;


public class o18 {
    private String cardNumber;
    private double creditLimit;
    private double balance;

    public o18(String cardNumber, double creditLimit, double balance) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.balance = balance;
    }

    

    public void updateCreditLimit(double newLimit) {
        if (newLimit < balance) {
            System.out.println("New credit limit cannot be lower than current balance.");
        } else {
            creditLimit = newLimit;
            System.out.println("Credit limit updated to $" + creditLimit );
        }
}}
