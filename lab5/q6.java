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
public class q6 {
    @Override
public CircularlyLinkedList<E> clone() {
    CircularlyLinkedList<E> clonedList = new CircularlyLinkedList<>();
    if (isEmpty()) {
        return clonedList;
    }
    Node<E> current = tail.getNext();
    for (int i = 0; i < size(); i++) {
        clonedList.addLast(current.getElement());
        current = current.getNext();
    }
    return clonedList;
}

}
