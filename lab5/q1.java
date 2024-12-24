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
public class q1 {
    public void addFirst(E e) {
    if (isEmpty()) {
        tail = new Node<>(e, null);
        tail.setNext(tail);
    } else {
        tail.setNext(new Node<>(e, tail.getNext()));
    }
}

}
