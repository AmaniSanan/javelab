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
public class q3 {
    @Override
public boolean equals(Object o) {
    if (!(o instanceof CircularlyLinkedList)) {
        return false;
    }
    CircularlyLinkedList<?> other = (CircularlyLinkedList<?>) o;
    if (this.size() != other.size()) {
        return false;
    }
    Node<E> walkA = this.tail.getNext();
    Node<?> walkB = other.tail.getNext();
    for (int i = 0; i < this.size(); i++) {
        if (!walkA.getElement().equals(walkB.getElement())) {
            return false;
        }
        walkA = walkA.getNext();
        walkB = walkB.getNext();
    }
    return true;
}

}
