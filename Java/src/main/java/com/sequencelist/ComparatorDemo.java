package com.sequencelist;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<ComparatorDemo>{
    private String str;

    public ComparatorDemo() {
    }

    public ComparatorDemo(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public int compare(ComparatorDemo o1, ComparatorDemo o2) {
        if(o1.getStr().compareTo(o2.getStr()) > 0) {
            return 1;
        }

        if(o1.getStr().compareTo(o2.getStr()) < 0) {
            return -1;
        }

        if(o1.getStr().compareTo(o2.getStr()) == 0) {
            return 0;
        }

        return -2;
    }

    public static void main(String[] args) {
        ComparatorDemo d1 = new ComparatorDemo("a");
        ComparatorDemo d2 = new ComparatorDemo("b");

        ComparatorDemo d = new ComparatorDemo();
        System.out.println(d.compare(d1, d2));
    }
}
