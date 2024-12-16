/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_;

/**
 *6.Describe in detail an algorithm for
 * reversing a singly linked list L using only a constant amount of additional space.
 * @author KH
 */
public class q6 {
    public void reverse() {
    Node<E> x = null;
    Node<E> y = head;

    while (y != null) {
        Node<E> next = y.next;
        y.next = x;
        x = y;
        y = next;
    }
    head = x;
}
}
