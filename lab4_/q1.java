/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_;

//develop an implementation of the equals method in the 
//context of the SinglyLinkedList class.

public class q1 {
        public boolean equals(SinglyLinkedList<E> other) {
        if (this.size != other.size) return false;

        SinglyLinkedList.Node<E> current1 = this.head;
        SinglyLinkedList.Node<E> current2 = other.head;

        while (current1 != null) {
            if (!current1.element.equals(current2.element)) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }
}
