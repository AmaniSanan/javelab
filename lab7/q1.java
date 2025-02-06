/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *1.Implement a method with signature transfer(S, T) that transfers all elements 
 * from stack S onto stack T, so that the element that starts at the top of S is the first 
 * to be inserted onto T, and the element at the bottom of S ends up at the top of T.
 * @author KH
 */
public class q1 {
   
    public static void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }
}

