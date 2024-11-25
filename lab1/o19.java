/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;


public class o19 {
 
    private double balance;

    public o19(double balance) {
        this.balance = balance;
    }

    

    public void makePayment(double payment) {
    if (payment < 0) {
        System.out.println("Cannot process negative payment amount.");
    } else {
        balance -= payment;
    }

}}
