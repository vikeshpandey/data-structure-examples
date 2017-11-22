package com.example.stringarray;

import java.util.Arrays;

public class CustomArrayList {
    int capacity = 10;
    Object[] array;
    int filledCapacity = 0;

    public CustomArrayList() {
        this.array = new Object[this.capacity];
    }

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object element) {
        boolean newCapacity = false;
        if(this.filledCapacity == this.capacity) {
            int newCapacity1 = this.capacity + (this.capacity >> 1);
            this.array = Arrays.copyOf(this.array, newCapacity1);
            this.capacity = newCapacity1;
        }

        this.array[this.filledCapacity++] = element;
    }

    public int size() {
        return this.array.length;
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        System.out.println("size of the array list while being initialized: " + customArrayList.size());
        customArrayList.add("1");
        customArrayList.add("2");
        customArrayList.add("3");
        customArrayList.add("4");
        customArrayList.add("5");
        customArrayList.add("6");
        customArrayList.add("7");
        customArrayList.add("8");
        customArrayList.add("9");
        customArrayList.add("10");
        customArrayList.add("11");
        System.out.println("size of the array list now: " + customArrayList.size());
    }
}

