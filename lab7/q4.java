/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *4.	Implement the clone( ) method for the ArrayStack class.
 * @author KH
 */
public class q4 {
      public ArrayStack<E> clone() {
        ArrayStack<E> clonedStack = new ArrayStack<>();
        clonedStack.stack = new ArrayList<>(this.stack);
        return clonedStack;
    }
}
