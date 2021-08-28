package epam.jwd.impl;

import epam.jwd.CustomArrayList;

import java.util.Arrays;

public class CustomArrayListImpl implements CustomArrayList {
    private static int INITIAL_CAPACITY = 10;
    private Object[] array;
    private int size = 0;

    public CustomArrayListImpl()
    {
        array = new Object[INITIAL_CAPACITY];
    }

    public CustomArrayListImpl(Object[] array) {
        this.array = array;
    }

    @Override
    public void add(Object element) {
        if(size == array.length)
        {
            array = Arrays.copyOf(array, array.length + 10);
        }
        array[size] = element;
        size++;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size - 1; i++)
        {
            array[i] = array[i+1];
        }
        size--;
    }

    @Override
    public void showAll() {
       for (int i = 0; i < size; i ++)
       {
           System.out.print(array[i] + " ");
       }
        System.out.println();
    }

}
