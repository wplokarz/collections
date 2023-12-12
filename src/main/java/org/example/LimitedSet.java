package org.example;

import java.util.HashSet;

// custom set where user can add only three elements, otherwise error is thrown
public class LimitedSet<E> extends HashSet<E> {
    private final int maxSize = 3;


    @Override
    public  boolean add(E element) {
        if (size() < maxSize) {
            return super.add(element);
        }
        else {
            throw new RuntimeException("Users set size should be 3!");
        }
    }
}
