/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author KH
 */
public class q7 {
    public DoublyLinkedListClone clone() {
        DoublyLinkedListClone cloneList = new DoublyLinkedListClone();
        Node current = this.header.next;

        while (current != this.trailer) {
            cloneList.addlast(current.element);
            current = current.next;
        }

        return cloneList;
    }
}
