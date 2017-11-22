package com.example.stringarray;

import java.util.Arrays;

public class CustomStringBuilder {
    private char[] arr = new char[16];
    private int filledCapacity;

    public CustomStringBuilder() {
    }

    public CustomStringBuilder(String s) {
        char[] cArr = s.toCharArray();
        int i = 0;

        for (int j = 0; j < cArr.length; ++j) {
            this.arr[i] = cArr[j];
            ++this.filledCapacity;
            ++i;
        }

    }

    public CustomStringBuilder append(String s) {
        boolean newCapacity = false;
        if (this.filledCapacity + s.length() >= this.arr.length) {
            int newCapacity1 = this.arr.length + this.filledCapacity + s.length() * 2;
            this.arr = Arrays.copyOf(this.arr, newCapacity1);
        }

        return this.appendInternal(s);
    }

    private CustomStringBuilder appendInternal(String s) {
        char[] cArr = s.toCharArray();
        ++this.filledCapacity;
        int i = this.filledCapacity;

        for (int j = 0; j < cArr.length; ++j) {
            this.arr[i] = cArr[j];
            ++this.filledCapacity;
            ++i;
        }

        return this;
    }

    public String toString() {
        return new String(this.arr);
    }

    public static void main(String[] args) {
        CustomStringBuilder stringBuilder = new CustomStringBuilder("first");
        stringBuilder.append(" ");
        stringBuilder.append("1");
        stringBuilder.append(" ");
        stringBuilder.append("2");
        stringBuilder.append(" ");
        stringBuilder.append("3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        stringBuilder.append("    3sadgfhjgdsadgfhj");
        System.out.println("String built now: " + stringBuilder.toString());
    }
}