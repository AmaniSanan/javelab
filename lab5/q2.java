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
public class q2 {
    public int size() {
    if (isEmpty()) {
        return 0;
    }
    int count = 1;
    Node<E> current = tail.getNext();
    while (current != tail) {
        count++;
        current = current.getNext();
    }
    return count;
}

}
