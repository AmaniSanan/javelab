/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_;

/**
 *3.Give an implementation of the size( ) method for the SingularlyLinkedList 
 * class, assuming that we did not maintain size as an instance variable.
 * @author KH
 */
public class q3 {
    
    public int Size() {
    int count = 0;
    Node<E> x = head;
    while (x != null) {
        count++;
        x = x.next;
    }
    return count;
}

}
