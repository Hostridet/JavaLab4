package com.company;


import java.util.*;

public class stack<T> {
    private T value;
    private int Size;
    private List<T> array;
    private int pos;


    public stack(int size)
    {
        Size = size;
        array = new ArrayList<T>();
        pos = 0;
    }


    public void push (T el) throws StackError {
        if (Size > pos)
        {
            array.add(el);
            pos++;
        }
        else {
            throw new StackError("Stack is full");
        }
    }


    public T pop() throws StackError
    {
        if (pos == 0)
        {
            throw new StackError("Stack is empty");
        }
        T temp = array.get(pos - 1);
        array.remove(pos - 1);
        pos--;
        return temp;
    }


    public void print()
    {
        for(T item: array)
            System.out.print("[" + item + "] ");
        System.out.println();
    }


    public boolean search(T el) throws StackError
    {
        if (pos == 0)
        {
            throw new StackError("Stack is empty");
        }
        for(T item: array)
            if (item == el)
                return true;
        return false;

    }
}

