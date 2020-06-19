package com.company.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        for (int i = 0; i < 6; i++) {
            list.add(i);
        }

        Iterator iter = list.listIterator();

        while (iter.hasNext()) {
            Object object = iter.next();
            System.out.println(object);
        }
    }
}
