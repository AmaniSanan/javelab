/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

//2.	Give an implementation of the size( ) method for the DoublyLinkedList
//class, assuming that we did not maintain size as an instance variable.
public class q2 {
  public int size() {
        int count = 0;
        Node<E> x = header.next;
        while (x != trailer) {
            count++;
            x = x.next;
        }
        return count;
    }
  
}
