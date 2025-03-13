package com.grepp.library.c_collection.c_set.grepp;

import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.z_domain.Node;
import java.util.Arrays;

@SuppressWarnings("unchecked")
public class _HashSet<E> {

    private static final int DEFAULT_CAPACITY= 10;
    protected Object[] elementData;
    private int arraySize = 10;
    private int size;

    public _HashSet() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    protected int hash(E e) {
        int hashCode = Math.abs(e.hashCode());
        return hashCode % arraySize;
    }

    private void resize() {
        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < arraySize; i++) {
            if(elementData[i] == null) continue;
            int newIndex = hash((E) elementData[i]);
            temp[newIndex] = elementData[i];
        }

        elementData = temp;
    }

    public boolean add(E e) {
        _LinkedList<E> newList = new _LinkedList<>();
        newList.add(e);

        if (size == arraySize - 1) {
            resize();
        }

        int index = hash(e);
        _LinkedList<E> head = (_LinkedList<E>) elementData[index];

        if (head == null) {
            elementData[index] = newList;
            size++;
            return true;
        }

        if (head.contains(e)) {
            return false;
        }

        head.add(e);
        size++;
        return true;
    }

    public boolean remove(E e) {
        int index = hash(e);
        _LinkedList<E> head = (_LinkedList<E>) elementData[index];

        if (head == null) {
            return false;
        }

        if (head.contains(e)) {
            head.remove(e);
            size--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        boolean first = true;

        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] instanceof _LinkedList) {
                _LinkedList<E> list = (_LinkedList<E>) elementData[i];
                for (int j = 0; j < list.size(); j++) {
                    sb.append(list.get(j));
                }
            }
            if (i != elementData.length - 1) sb.append(" /// ");
        }

        sb.append("]");
        return sb.toString();
    }
}
