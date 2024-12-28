/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * 3.	Implement the equals( ) method for the DoublyLinkedList class.
 */
public class q3 {
       // Question 3: Implementing equals() method
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DoublyLinkedList)) {
            return false;
        }

        DoublyLinkedList other = (DoublyLinkedList) obj;
        Node a = this.header.next;
        Node b = other.header.next;

        while (a != this.trailer && b != other.trailer) {
            if (!a.element.equals(b.element)) {
                return false;
            }
            a = a.next;
            b = b.next;
        }

        return a == this.trailer && b == other.trailer;
    } 
}
