/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

//If the parameter to the makePayment method of the CreditCard class 
//(see Code Fragment 1.5) were a negative number, that would have the effect of
//raising the balance on the account. Revise the implementation so that it throws an 
//IllegalArgumentException if a negative amount is sent as a parameter.
//
//
//public void makePayment(double amount) { // make a payment
//            if(amount<0)
//                throw new IllegalArgumentException("Negative Amount is not Allowed");
//        balance -= amount;
//        }

public class q12 {
    public int balence;
    public  void makrPrment(double amount){
    if(amount<0){
    throw new IllegalArgumentException("negetive number");
    }
    
        balence-=amount;
    }
     

     public static void main(String[] args) {
  
    
}
}