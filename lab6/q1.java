/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
//Describe a method for finding the middle node of a doubly linked list with header and trailer
//sentinels by “link hopping,” and without relying on explicit knowledge of the 
//size of the list. In the case of an 
//even number of nodes, report the node slightly left of center as the “middle.”
public class q1 {
    public Node<E> findMiddleNode() {
        Node<E> slow = header.next; // Start after the header sentinel
        Node<E> fast = header.next; // Start after the header sentinel

        while (fast != null && fast.next != null && fast.next != trailer) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; 
    }
}
