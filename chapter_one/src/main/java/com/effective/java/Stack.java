package com.effective.java;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITAL_CAPACITY];
    }
    public void push(Object o){
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        Object result = elements[--size];

        //如果先增长，再回收，对象不会被回收
        elements[size] = null;//********Eliminate obsolete reference 这个对象如果不处理，一直不会用，但是不会被垃圾回收器回收
        return result;
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements,2*size+1);
        }
    }
}
