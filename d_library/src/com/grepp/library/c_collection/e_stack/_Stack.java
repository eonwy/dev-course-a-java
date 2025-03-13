package com.grepp.library.c_collection.e_stack;

import com.grepp.library.c_collection.z_domain.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class _Stack<E> implements Iterable<E> {
    private Node<E> top;
    private int size;

    public void push(E e) {
        Node<E> node = new Node<>(e);

        if (top != null) {
            node.setNext(top);
        }

        top = node;
        size++;
    }

    public E pop() {
        if (top == null) return null;

        E data = top.data();
        top = top.next();
        size--;
        return data;
    }

    public E peek() {
        if (top == null) return null;
        return top.data();
    }

    public boolean empty() {
        return size == 0;
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
