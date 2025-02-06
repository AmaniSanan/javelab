/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**2.	Give a recursive method for removing all the elements from a stack.
 *
 * @author KH
 */
public class q2 {
    public static void removeAll(Stack<E> S) {
        if (!S.isEmpty()) {
            S.pop();
            removeAll(S);
        }
    }
}
