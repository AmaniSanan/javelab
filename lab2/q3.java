/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

//Give a short fragment of Java code that uses the progression classes from 
//Section 2.2.3 to find the eighth value of a Fibonacci
//progression that starts with 2 and 2 as its first two values.

public class q3 {
private long current;   
    private long previous;  

    public q3(long frist, long secound) {
        this.current = frist;
        this.previous = secound;
    }

  

   
    public long nextValue() {
        long next = current + previous;
        previous = current;             
        current = next;               
        return current;                  
    }

    
    public long getNthValue(int n) {
        if (n == 1) return current;      
        if (n == 2) return previous;     
        long nthValue = 0;
        for (int i = 3; i <= n; i++) {
            nthValue = nextValue(); 
        }
        return nthValue;
    }
       

     public static void main(String[] args) {
     q3 fibProgression = new q3(2, 2);
        long eighthValue = fibProgression.getNthValue(8);
        System.out.println("القيمة الثامنة في تسلسل فيبوناتشي هي: " + eighthValue);
    }
}
