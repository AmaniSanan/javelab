Q/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_;

/**
 *
 * 2.	Give an algorithm for finding the second-to-last node in a singly 
 * 
       linked list in which the last node is indicated by a null next reference.
 */
public class q2 {
        public T afterToLast() {
        if (head == null || head.next == null) return null;

        SinglyLinkedList.Node<E> x = head;
        while (x.next.next != null) {
            x = x.next;
        }
        return x.element;
    }
}
