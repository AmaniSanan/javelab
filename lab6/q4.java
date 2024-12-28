/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *4.	Give an algorithm for concatenating two doubly linked 
 * lists L and M, with header and trailer sentinel nodes, into a single list L′.
 * @author KH
 */
public class q4 {
        public void concatenate(DoublyLinkedList other) {
        if (this.header.next == this.trailer) { // If this list is empty
            this.header.next = other.header.next;
            other.header.next.prev = this.header;
            this.trailer = other.trailer;
            return;
        }

        if (other.header.next == other.trailer) { // If other list is empty
            return;
        }

        // Concatenate the two lists
        this.trailer.prev.next = other.header.next;
        other.header.next.prev = this.trailer.prev;
        this.trailer = other.trailer;
    }
}
