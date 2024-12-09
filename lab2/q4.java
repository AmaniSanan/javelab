/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

//q4
public class Lab2 {
    public class Progression {
 // instance variable
 protected long current;

 
 public Progression( ) { this(0); }


 public Progression(long start) { current = start; }

 
 public long nextValue( ) {
 long answer = current;
 advance( ); // this protected call is responsible for advancing the current value
 return answer;
 }


 protected void advance( ) {
 current++;
 }


 public void printProgression(int n) {
 System.out.print(nextValue( )); // print first value without leading space
 for (int j=1; j < n; j++)
 System.out.print(" " + nextValue( )); // print leading space before others
 
 }
 }

public class ArithmeticProgression extends Progression {

 protected long increment;


 public ArithmeticProgression( ) { this(1, 0); } // start at 0 with increment of 1


 public ArithmeticProgression(long stepsize) { this(stepsize, 0); } // start at 0


 public ArithmeticProgression(long stepsize, long start) {
 super(start);
 increment = stepsize;
 }

 
 protected void advance( ) {
 current += increment;
 }
 }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
