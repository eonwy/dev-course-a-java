package com.grepp.library.c_collection.b_list.grepp;

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class _ArrayList <E> implements Iterable<E> {

    private Object[] elementData;
    private static final int DEFAULT_CAPACITY= 10;
    private int pointer;
    private int arraySize;

    public _ArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
        arraySize = DEFAULT_CAPACITY;
    }

    public boolean add(E e){
        if(pointer < arraySize){
            elementData[pointer] = e;
            pointer++;
            return true;
        }

        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < pointer; i++) {
            temp[i] = elementData[i];
        }

        temp[pointer] = e;
        elementData = temp;
        pointer++;
        return true;
    }

    public void addTest(int index, E element) {
        if (index < 0 || index > arraySize) {
            throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        }

        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < pointer; i++) {
            temp[i] = elementData[i];
        }
        elementData = temp;

        for (int i = pointer; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }

        elementData[index] = element;
        pointer++;

    }

    public E get(int index){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        return (E) elementData[index];
    }

    public int size(){
        return pointer;
    }

    public E set(int index, E element){
        if (index < 0 || index >= arraySize) {
            throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        }
        elementData[index] = element;
        return (E) elementData;
    }

    public E remove(int index) {
        if (index < 0 || index >= arraySize) {
            throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        }

        E removing = (E) elementData[index];

        for (int i = index; i < pointer - 1; i++) {
            elementData[i] = elementData[i + 1];
        }

        elementData[pointer - 1] = null;
        pointer--;

        return removing;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int pointer;

            @Override
            public boolean hasNext () {
                return pointer < size();
            }

            @Override
            public E next () {
                if (pointer >= size()) throw new NoSuchElementException();
                E e = get(pointer);
                pointer++;
                return e;
            }
        };
    }
}