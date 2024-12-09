/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

//Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance 
//variable balance has private visibility. Why is the following implementation 
//of the PredatoryCreditCard.charge method flawed? 
//public boolean charge(double price) {
//        boolean isSuccess = super.charge(price); 
//       if (!isSuccess)
//           charge(5); // the penalty 
//       return isSuccess;
// } 
//
//



public class q1 {
   class CreditCard {
    protected double balance;

    public boolean charge(double price) {
        if (price > balance) {
            return false; 
        }
        balance -= price; 
        return true; 
    }
}

class PredatoryCreditCard extends CreditCard {
    @Override
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price); 
        if (!isSuccess) {
            super.charge(5); 
        }
        return isSuccess;
    }}

  

     public static void main(String[] args) {
         
     
         
         
         
         
      
       
    }
}
