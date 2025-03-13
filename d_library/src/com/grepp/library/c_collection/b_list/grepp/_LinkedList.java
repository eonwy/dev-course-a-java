package com.grepp.library.c_collection.b_list.grepp;

import com.grepp.library.c_collection.z_domain.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class _LinkedList<E> implements _List<E> {

    private Node<E> head;
    private int pointer;

    public int size(){
        return pointer;
    }

    public boolean isEmpty(){
        return pointer == 0;
    }

    public boolean add(E e){
        Node<E> current = new Node<>(e);

        if(pointer == 0){
            head = current;
            pointer++;
            return true;
        }

        Node<E> link = head;
        while(link.next() != null){
            link = link.next();
        }

        link.setNext(current);
        pointer++;
        return true;
    }

    public void addTest(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            pointer++;
        } else {
            Node<E> link = head;
            Node<E> prev = null;
            for (int i = 0; i < index; i++) {
                prev = link;
                link = link.next();
            }
            newNode.setNext(link);
            prev.setNext(newNode);
            pointer++;
        }
    }

    public E get(int index){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

        Node<E> link = head;
        for (int i = 0; i < index; i++) {
            link = link.next();
        }

        return link.data();
    }

    public E set(int index, E e){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

        Node<E> link = head;

        for (int i = 0; i < index; i++) {
            link = link.next();
        }

        E modified = link.data();
        link.setData(e);
        return modified;
    }

    public boolean remove(E e){
        if (head == null) {
            return false;
        }

        Node<E> link = head;
        Node<E> prevNode = null;

        while (link != null) {
            if (link.data().equals(e)) {
                if (prevNode == null) {
                    head = link.next();
                } else {
                    prevNode.setNext(link.next());
                }
                pointer--;
                return true;
            }
            prevNode = link;
            link = link.next();
        }
        return false;
    }

    public boolean contains(E e){
        Node<E> link = head;
        while(link != null){
            if(link.data().equals(e)) return true;
            link = link.next();
        }
        return false;
    }

    // 단지 함수 호출을 위해 사용하고자 하는 것이니
    // 익명클래스로 제작함
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int pointer;

            @Override
            public boolean hasNext() {
                return pointer < size();
            }

            @Override
            public E next() {
                if (pointer >= size()) throw new NoSuchElementException();
                E e = get(pointer);
                pointer++;
                return e;
            }
        };
    }
}