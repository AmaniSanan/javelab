/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author KH
 */
public class o20 {
    private String cardNumber;
    private double creditLimit;
    private double balance;

    public o20(String cardNumber, double creditLimit, double balance) {
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
    }
    
    public void makePayment(double payment) {
    if (payment < 0) {
        System.out.println("Cannot process negative payment amount.");
    } else {
        balance -= payment;
    }}
     public static void main(String[] args) {
         o20 [] cards=new o20[3];
         cards[0]=new o20("amani",200,2000);
         cards[1]=new o20("safwan",800,8000);
          cards[2]=new o20("safa",100,1000);       
    for (int i = 0; i < 16; i++) {
    if (i < 4)

        cards[0].updateCreditLimit(2500);
    else if (i < 8)
        cards[1].updateCreditLimit(1000);
    else if (i < 12)
        cards[2].updateCreditLimit(1500);
    else
        cards[i-12].makePayment(200);
}}

}
