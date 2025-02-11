/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author KH
 */
public class q1 {
    public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size = 0;

    // الإنشاء الافتراضي
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    // إنشاء بحجم مخصص
    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E get(int i) {
        checkIndex(i);
        return data[i];
    }

    public E set(int i, E e) {
        checkIndex(i);
        E old = data[i];
        data[i] = e;
        return old;
    }

    public void add(E e) {
        if (size == data.length) resize(2 * data.length);
        data[size++] = e;
    }

    public void add(int i, E e) {
        checkIndex(i);
        if (size == data.length) resize(2 * data.length);
        for (int k = size - 1; k >= i; k--) data[k + 1] = data[k];
        data[i] = e;
        size++;
    }

    public E remove(int i) {
        checkIndex(i);
        E removed = data[i];
        for (int k = i; k < size - 1; k++) data[k] = data[k + 1];
        data[size - 1] = null;
        size--;
        return removed;
    }

    private void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        for (int k = 0; k < size; k++) temp[k] = data[k];
        data = temp;
    }

    private void checkIndex(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Invalid index: " + i);
    }
}

}
