package com.grepp.library.c_collection.f_queue;

import com.grepp.library.c_collection.z_domain.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class _Queue<E> implements Iterable<E>{

    private Node<E> top;
    private Node<E> tail;
    private int size;

    public void offer(E e) {
        Node<E> node = new Node<>(e);

        if (top == null) {
            top = node;
            tail = node;
            size++;
            return;
        }

        tail.setNext(node);
        tail = node;
        size++;
    }

    public E peek() {
        if (top == null) return null;
        return top.data();
    }

    public E poll() {
        if (top == null) return null;

        E data = top.data();
        top = top.next();
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (current == null) throw new NoSuchElementException();
                E data = current.data();
                current = current.next();
                return data;
            }
        };
    }
}
