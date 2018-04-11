package com.linklist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableString implements Iterable<Character>, Iterator<Character> {
    private String str;
    private int count = 0;

    public IterableString(String s) {
        str = s;
    }

    @Override
    public Iterator<Character> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        if (count < str.length()) {
            return true;
        }
        return false;
    }

    @Override
    public Character next() {
        if (count == str.length()) {
            throw new NoSuchElementException();
        }

        count++;
        return str.charAt(count - 1);
    }

    public static void main(String args[]) {
        IterableString x = new IterableString("Hello");

        for (char ch : x) {
            System.out.println(ch);
        }
    }
}
