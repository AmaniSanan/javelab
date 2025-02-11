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
public class q2 {
    import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements Iterable<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size = 0;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public void add(E e) {
        if (size == data.length) resize(2 * data.length);
        data[size++] = e;
    }

    private void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        for (int k = 0; k < size; k++) temp[k] = data[k];
        data = temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<E> {
        private int j = 0;
        public boolean hasNext() { return j < size; }
        public E next() {
            if (j == size) throw new NoSuchElementException();
            return data[j++];
        }
    }
}

}
