package com.sequencelist;

public class ComparableDemo implements Comparable<ComparableDemo>{
    private String str;

    public ComparableDemo(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        if(this.str.compareTo(o.str) > 0) {
            return 1;
        }

        if (this.str.compareTo(o.str) < 0) {
            return -1;
        }

        if (this.str.compareTo(o.str) == 0) {
            return 0;
        }

        return -2;
    }

    public static void main(String[] args) {
        ComparableDemo d1 = new ComparableDemo("a");
        ComparableDemo d2 = new ComparableDemo("c");

        System.out.println(d1.compareTo(d2));
        System.out.println(d2.compareTo(d1));
        System.out.println(d1.compareTo(d1));
    }
}
