/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author KH
 */
public class q5
{
   public CircularlyLinkedList<E>[] splitList() {
    if (size() % 2 != 0) {
        throw new IllegalArgumentException("List must have an even number of nodes");
    }

    CircularlyLinkedList<E> firstHalf = new CircularlyLinkedList<>();
    CircularlyLinkedList<E> secondHalf = new CircularlyLinkedList<>();

    int mid = size() / 2;
    Node<E> current = tail.getNext();

    for (int i = 0; i < size(); i++) {
        if (i < mid) {
            firstHalf.addLast(current.getElement());
        } else {
            secondHalf.addLast(current.getElement());
        }
        current = current.getNext();
    }

    return new CircularlyLinkedList[]{firstHalf, secondHalf};
}
 
}
