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
public class q6 {
    private Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    public void rotate() {
        if (head != null) {
            head = head.next;
        }
    }

    public void rotateBackward() {
        if (head != null) {
            head = head.prev;
        }
    }
}
