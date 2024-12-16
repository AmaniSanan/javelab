/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_;

/**
 *4.Implement a rotate( ) method in the SinglyLinkedList class, which has semantics
 * equal to addLast(removeFirst( )), yet without creating any new node. 
 * 
 */
public class q4 {
       public void rotate() {
        if (head == null || head.next == null) return;

        SinglyLinkedList.Node<E> x = head;
        head = head.next;

        SinglyLinkedList.Node<E> y = head;
        while (y.next != null) {
            y = y.next;
        }
        y.next = x;
        x.next = null;
    } 
}
