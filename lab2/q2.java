
package lab2;
//Assume that we change the CreditCard class (see Code Fragment 1.5) so that 
//instance variable balance has private visibility. 
//Why is the following implementation of the PredatoryCreditCard.charge
//method flawed? 
//public boolean charge(double price) { 
//boolean isSuccess = super.charge(price); 
//if (!isSuccess) 
//      super.charge(5); // the penalty
// return isSuccess;


public class q2 {
       class CreditCard {
    double balance;
    double limit;
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
        
        if (price + 5 <= limit) {
            super.charge(5); 
            System.out.println("Penalty applied.");
        } else {
            System.out.println("Penalty not applied due to credit limit.");
        }
    }
    return isSuccess;
    }}
}
