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
public class q1 {
    public class ArrayQueue<E> {
    private E[] data;
    private int f = 0; // مؤشر العنصر الأمامي
    private int sz = 0; // حجم الطابور
    private static final int CAPACITY = 100;

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return sz == 0;
    }

    public void enqueue(E e) {
        if (sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }

    public E dequeue() {
        if (isEmpty()) return null;
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }

    public void rotate() {
        if (!isEmpty()) {
            E temp = data[f];
            f = (f + 1) % data.length; // تحريك المؤشر الأمامي
            data[(f + sz - 1) % data.length] = temp; // وضع العنصر الأخير في المكان المناسب
        }
    }
}
}
