package com.grepp.library.c_collection.d_map.grepp;

import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.c_set.grepp._HashSet;
import com.grepp.library.c_collection.c_set.grepp._HashSet_p2;
import com.grepp.library.c_collection.z_domain.Node;

public class _EntrySet<E> extends _HashSet<E> {

    public _EntrySet() {
    }

    @Override
    public boolean add(E e) {
        if(get(e) != null){
            super.remove(e);
        }

        return super.add(e);
    }

    public E get(E e) {
        int index = hash(e);
        _LinkedList<E> head = (_LinkedList<E>) elementData[index];

        if (head == null) return null;

        for (int i = 0; i < head.size(); i++) {
            if (head.get(i).equals(e)) {
                return head.get(i);
            }
        }

        return null;
    }
}
