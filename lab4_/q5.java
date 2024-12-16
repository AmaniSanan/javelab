/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_;

/**
 *5.Describe an algorithm for concatenating two singly linked lists L and M, into a single list L′ that
 * contains all the nodes of L followed by all the nodes of M.
 * 
 */
public class q5 {
        public void concatenate(SinglyLinkedList<E> m ) {
        if (this.isEmpty()) {
            this.head = m.head;
        } else {
            SinglyLinkedList.Node<T> l = this.head;
            while (l.next != null) {
                l = l.next;
            }
           l.next =m.head;
        }
        this.size += m.size;
    }
}
