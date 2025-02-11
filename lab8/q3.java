/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author KH
 */
public class q3 {
    public class LinkedQueue<E> {
    private static class Node<E> {
        E element;
        Node<E> next;
        Node(E e, Node<E> n) { element = e; next = n; }
    }

    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    public boolean isEmpty() { return size == 0; }
    
    public void enqueue(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) front = newest;
        else rear.next = newest;
        rear = newest;
        size++;
    }

    public void concatenate(LinkedQueue<E> Q2) {
        if (Q2.isEmpty()) return;
        if (this.isEmpty()) {
            this.front = Q2.front;
            this.rear = Q2.rear;
        } else {
            this.rear.next = Q2.front;
            this.rear = Q2.rear;
        }
        this.size += Q2.size;
        Q2.front = Q2.rear = null; // تفريغ Q2
        Q2.size = 0;
    }
}

}
